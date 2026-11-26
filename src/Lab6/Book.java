
package Lab6;

public class Book {

    private final String title;
    private final String author;
    private final String isbn;
    private boolean available;

    // Constructor
    public Book(String title, String author, String isbn) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setter
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display book information
    @Override
    public String toString() {

        return "Title: " + title
                + ", Author: " + author
                + ", ISBN: " + isbn
                + ", Available: " + available;
    }
}
