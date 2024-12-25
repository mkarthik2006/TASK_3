package KarthikLibrary;

class Library {
    private Book[] books;
    private int nextBookID;

    public Library() {
        books = new Book[5];
        nextBookID = 1;
    }

    public void addBook(int bookID, String title, String author) {
        if (nextBookID <= books.length) {
            books[nextBookID - 1] = new Book(nextBookID, title, author);
            nextBookID++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        if (bookID >= 1 && bookID <= nextBookID) {
            books[bookID - 1] = null;
        } else {
            System.out.println("Invalid book ID.");
        }
    }

    public Book searchBook(int bookID) {
        if (bookID >= 1 && bookID <= nextBookID) {
            return books[bookID - 1];
        } else {
            return null;
        }
    }

    public void displayBooks() {
        for (int i = 0; i < nextBookID; i++) {
            if (books[i] != null) {
                System.out.println("Book ID: " + books[i].getBookID() +
                        ", Title: " + books[i].getTitle() +
                        ", Author: " + books[i].getAuthor());
            }
        }
    }
}


