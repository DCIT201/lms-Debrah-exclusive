/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("A farmer's guide", "Chris Anorlds", 2000));
        library.addBook(new Book("Alpha Male", "Andrew Tate", 2023));

        // List of all books in the library
        System.out.println("Books in the library:");
        library.listBooks();

        // Creating a patron
        Patron patron = new Patron("Kwesi", 1);

        // Borrowing a book
        patron.borrowBook(new Book("A farmer's guide", "Chris Anorlds", 2000), library);

        // List of borrowed books
        System.out.println("\nBorrowed books:");
        patron.listBorrowedBooks();

        // Return the book
        patron.returnBook(new Book("A farmer's guide", "Chris Anorlds", 2000), library);

        // Final library state
        System.out.println("\nBooks in the library after operations:");
        library.listBooks();
    }
}