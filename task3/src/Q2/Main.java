package Q2;

import Q1.Book;
import Q1.Library;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
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
        System.out.println("the book is deleted");

        /*Q2.Employee e= new Q2.Employee(10,"John", 100000.00);
        Q2.Product p = new Q2.Product(12,1500.00,5);
        System.out.println();

        *//*Scanner scanner=new Scanner(System.in);

        System.out.println("Emp Id is:");
        int empId = scanner.nextInt();
        System.out.println("Emp NAme is:");
        String empName = scanner.nextLine();
        System.out.println("Emp Salary is:");
        Double empSalary  = scanner.nextDouble();
        System.out.println("Pro Id is:");
        int proId = scanner.nextInt();
        System.out.println("Emp NAme is:");
        Double proPrice = scanner.nextDouble();
        System.out.println("Emp Salary is:");
        int proQuantity = scanner.nextInt();*//*
*/


    }

}