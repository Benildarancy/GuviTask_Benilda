package org.task3.src.Q1;

public class Main {
    public static void main(String[]args){Library lib = new Library();
        //Adding books
        lib.addBook(new Book(121,"Edu Tech","John",true));
        lib.addBook(new Book(122,"Java Learn","Mathew",true));
        //Displaying Books
        System.out.println("Library Books:");
        lib.displayBook();
        //Replace the book
        lib.replaceBook(123,"Learn Java","Adam");
        //Search the book by Id
        System.out.println("Searching for:");
        lib.searchBook(121);
        //delete book
        lib.deleteBook(121);
        System.out.println("The book is deleted");

    }
}
