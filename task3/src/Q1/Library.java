package Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    List<Book> books = new ArrayList<>();
    public void addBook(Book book){   // Add a Book
        books.add(book);
    }
    public void displayBook(){
        // Display all the Books
        for (Book b:books)
            System.out.println(b.toString());
    }
    public void replaceBook(int bookId, String title,String author) {   // Replace book
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                b.setTitle("newTitle");
                b.setAuthor("newAuthor");
                break;
            }
        }
    }
    public void searchBook(int bookId){
       List<Book> s = books.stream().filter(a -> a.getBookId() == bookId).collect(Collectors.toList());
        System.out.println(s);
    }
    public void deleteBook(int bookId){
    books.removeIf(b -> b.getBookId()== bookId);
    }


}
