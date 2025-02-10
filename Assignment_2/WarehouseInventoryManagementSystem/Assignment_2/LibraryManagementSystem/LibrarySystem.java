package Assignment_2.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

abstract class LibrarySystem implements ILibrary {
    protected List<Book> books = new ArrayList<>();
    protected List<User> users = new ArrayList<>();

    public abstract void addBook(Book book);

    public abstract void addUser(User user);
}
