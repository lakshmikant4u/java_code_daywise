package com.day5.librarymanagementsystem;

class LibrarySystem {
    // Volatile: visibility across threads
    private volatile boolean isOnline = true;

    public void goOffline() {
        isOnline = false;
        System.out.println("Library system is now offline.");
    }

    public boolean isOnline() {
        return isOnline;
    }
}

class Book {
    private final int bookId; // Final: cannot be changed
    private String title;
    private String author;
    protected static int totalBooks = 0; // Shared counter

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public void showBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Total Books: " + totalBooks);
    }
}

class LibraryMember {
    private String memberName;
    private int issuedBooks = 0;

    public LibraryMember(String name) {
        this.memberName = name;
    }

    // Synchronized methods for safe multi-thread access
    public synchronized void issueBook(Book book) {
        if (book != null) {
            issuedBooks++;
            System.out.println(memberName + " issued book: " + bookTitle(book));
        }
    }

    public synchronized void returnBook(Book book) {
        if (issuedBooks > 0) {
            issuedBooks--;
            System.out.println(memberName + " returned book: " + bookTitle(book));
        } else {
            System.out.println(memberName + " has no books to return.");
        }
    }

    private String bookTitle(Book book) {
        return book.getClass().getSimpleName() + " #" + book.hashCode();
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();
        Book b1 = new Book(101, "Wings of Fire", "A.P.J Abdul Kalam");
        Book b2 = new Book(102, "The Guide", "R.K. Narayan");

        LibraryMember user1 = new LibraryMember("Anjali Mishra");
        LibraryMember user2 = new LibraryMember("Rahul Verma");

        if (system.isOnline()) {
            b1.showBookInfo();
            b2.showBookInfo();

            Thread t1 = new Thread(() -> {
                user1.issueBook(b1);
                user1.returnBook(b1);
            });

            Thread t2 = new Thread(() -> {
                user2.issueBook(b2);
                user2.returnBook(b2);
            });

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            system.goOffline();
        }
    }
}
