package lab4;

public class task3 {

    static class Book {
        private String title, author;
        private boolean isIssued;

        Book(String title, String author, boolean isIssued) {
            this.title = title;
            this.author = author;
            this.isIssued = isIssued;
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

        public boolean getIsIssued() {
            return isIssued;
        }

        public void setIsIssued(boolean isIssued) {
            this.isIssued = isIssued;
        }

        void issueBook() {
            isIssued = true;
        }

        void returnBook() {
            isIssued = false;
        }
    }

    static class Library {
        Book[] book = new Book[10];
        int count = 0;

        void addBook(Book b) {
            book[count] = b;
            count++;
        }

        void showAvailableBooks() {
            for (int i = 0; i < count; i++) {
                if (book[i].getIsIssued() == false) {
                    System.out.println(book[i].getTitle());
                    System.out.println(book[i].getAuthor());
                }
            }
        }

        void issueBook(String title) {
            for (int i = 0; i < count; i++) {
                if (book[i].getTitle() == title) {
                    if (book[i].getIsIssued() == false) {
                        book[i].issueBook();
                        System.out.println("Book issued successfully");
                    } else {
                        System.out.println("Book is already issued");
                    }
                    return;
                }
            }
            System.out.println("Book not found");
        }

        void returnBook(String title) {
            for (int i = 0; i < count; i++) {
                if (book[i].getTitle() == title) {
                    if (book[i].getIsIssued() == true) {
                        book[i].returnBook();
                        System.out.println("Book returned successfully");
                    } else {
                        System.out.println("Book was not issued");
                    }
                    return;
                }
            }
            System.out.println("Book not found");
        }
    }

    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook(new Book("Harry Potter", "J.K. Rowling", false));
        lib.addBook(new Book("The Hobbit", "Tolkien", false));
        lib.addBook(new Book("Atomic Habits", "James Clear", false));
        lib.addBook(new Book("1984", "George Orwell", false));
        lib.addBook(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", false));

        System.out.println("Available Books:");
        lib.showAvailableBooks();

        lib.issueBook("Harry Potter");
        lib.issueBook("The Hobbit");

        System.out.println("\nAvailable Books After Issuing:");
        lib.showAvailableBooks();

        lib.returnBook("Harry Potter");

        System.out.println("\nAvailable Books After Returning:");
        lib.showAvailableBooks();
    }

}