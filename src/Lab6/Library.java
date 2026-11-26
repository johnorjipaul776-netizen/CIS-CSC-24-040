package Lab6;

public class Library {

    private final Book[] books;

    // Constructor
    public Library(Book[] books) {
        this.books = books;
    }

    // Borrow a book
    public void borrow(String isbn) {

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("This book is not available.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Return a book
    public void giveBack(String isbn) {

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Display all books
    public void displayBooks() {

        for (Book book : books) {
            System.out.println(book);
        }
    }
}