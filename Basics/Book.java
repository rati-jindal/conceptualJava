package Basics;

public class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book() {
        this("Unknown Title", "Unknown Author", 0.0);

    }
//Note: If you use this(), it must be the very first line of the constructor.
    void displayInfo() {
        System.out.println("Basics.Book Author:" + this.author);
        System.out.println("Basics.Book Price:" + this.price);
        System.out.println("Basics.Book Title:" + this.title);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Rowling", 29.99);
        Book book2 = new Book();

        book1.displayInfo();
        book2.displayInfo();

    }
}
