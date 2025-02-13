package Assignment_2.LibraryManagementSystem;

public class LibraryManager extends LibrarySystem {
    private static final int MAX_BOOKS_ALLOWED = 5;

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public synchronized void borrowBook(String ISBN, String userID)
            throws BookNotFoundException, UserNotFoundException, MaxBooksAllowedException {
        User user = findUserByID(userID);
        Book book = searchBookByISBN(ISBN);

        if (user.getBorrowedBooks().size() >= MAX_BOOKS_ALLOWED) {
            throw new MaxBooksAllowedException("User " + userID + " has reached the maximum allowed books.");
        }

        user.getBorrowedBooks().add(book);
    }

    @Override
    public synchronized void returnBook(String ISBN, String userID)
            throws BookNotFoundException, UserNotFoundException {
        User user = findUserByID(userID);
        Book book = searchBookByISBN(ISBN);

        user.getBorrowedBooks().remove(book);
    }

    @Override
    public void reserveBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException {
        // Implementation for reserving books
    }

    @Override
    public Book searchBook(String title) {
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }

    private User findUserByID(String userID) throws UserNotFoundException {
        return users.stream().filter(user -> user.getUserID().equals(userID)).findFirst()
                .orElseThrow(() -> new UserNotFoundException("User with ID " + userID + " not found."));
    }

    private Book searchBookByISBN(String ISBN) throws BookNotFoundException {
        return books.stream().filter(book -> book.getISBN().equals(ISBN)).findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book with ISBN " + ISBN + " not found."));
    }
}
