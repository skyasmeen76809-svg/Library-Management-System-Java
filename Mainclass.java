package service;

import model.Book;

public class Mainclass {

    public static void main(String[] args) {

        BookService service = new BookService();

        Book book1 = new Book(1, "Java Basic", "James", true);
        service.addBook(book1);

        boolean issued = service.issueBook(1);
        System.out.println(issued);
    

boolean returned = service.returnBook(1);
System.out.println(returned);
    }
}
    
