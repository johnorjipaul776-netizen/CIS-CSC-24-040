package Lab6;

public class LibraryTest {

    public static void main(String[] args) {

        // Create three book objects

        Book book1 = new Book(
                "Java Programming",
                "James Gosling",
                "ISBN001"
        );

        Book book2 = new Book(
                "Introduction to Computing",
                "Peter Norton",
                "ISBN002"
        );

        Book book3 = new Book(
                "Data Structures",
                "Mark Allen",
                "ISBN003"
        );

        // Store books in an array

        Book[] bookList = {book1, book2, book3};

        // Create Library object

        Library library = new Library(bookList);

        // Display available books

        System.out.println("===== AVAILABLE BOOKS =====");

        library.displayBooks();

        // Borrow a book

        System.out.println("\n===== BORROWING A BOOK =====");

        library.borrow("ISBN001");

        // Display books after borrowing

        System.out.println("\n===== AFTER BORROWING =====");

        library.displayBooks();

        // Return the book

        System.out.println("\n===== RETURNING A BOOK =====");

        library.giveBack("ISBN001");

        // Display books after returning

        System.out.println("\n===== AFTER RETURNING =====");

        library.displayBooks();
    }
}