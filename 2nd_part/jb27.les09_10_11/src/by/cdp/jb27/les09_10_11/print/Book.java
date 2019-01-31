package by.cdp.jb27.les09_10_11.print;

public class Book extends Publication {

    private String author;

    public Book() {
        super();
    }

    public Book(String title, int price, String author, int year, int month, int day) {
        super(title, year, month, day, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book {" + super.toString() +
                ", author='" + author + "'}";

    }
}
