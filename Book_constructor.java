public class Book_constructor {
    String title;
    String author;
    int publication_year;

    // 1 Single Constructor [No arument constructor]
    public Book_constructor() {
        this.title = "ABC title";
        this.author = "ABC author";
        this.publication_year = 0;
        System.out.println("No-argument constructor called. Default book created.");
    }

    // 2 Multiple Constructors (Constuctor Overloading)
    public Book_constructor(String title, String author) {
        this.title = title;
        this.author = author;
        this.publication_year = 0; // default value
        System.out.println("Constructor with title and author called.");
    }

    // 3 Constructor with title, author, and publication year
    public Book_constructor(String title, String author, int publication_year) {
        this.title = title;
        this.author = author;
        this.publication_year = publication_year;
        System.out.println("Constructor with all details called.");
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("publication_year: " + this.publication_year);
    }

    // main

    public static void main(String[] args) {
        Book_constructor book1 = new Book_constructor();
        book1.displayBookDetails();

        Book_constructor book2 = new Book_constructor("The Great Gatsby", "F. Scott Fitzgerald");
        book2.displayBookDetails();

        Book_constructor book3 = new Book_constructor("1984", "George Orwell", 1949);
        book3.displayBookDetails();
    }
}
