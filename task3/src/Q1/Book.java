package Q1;

public class Book {
    int bookId;
    String title;
    String author;
    Boolean isAvailable;

    public Book(int bookId, String title, String author,Boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable=isAvailable;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}


