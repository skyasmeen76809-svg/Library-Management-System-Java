package service;

import java.util.ArrayList;
import model.Book;

public class BookService {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean issueBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.isAvailable()) {
                book.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && !book.isAvailable()) {
                book.setAvailable(true);
                return true;
            }
        }
        return false;
    }
}
