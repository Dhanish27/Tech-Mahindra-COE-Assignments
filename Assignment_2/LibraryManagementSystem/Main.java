package Assignment_2.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        library.addBook(new Book("Java Programming", "Author A", "12345"));
        library.addUser(new User("Alice", "U1001"));

        try {
            library.borrowBook("12345", "U1001");
            System.out.println("Book borrowed successfully!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
