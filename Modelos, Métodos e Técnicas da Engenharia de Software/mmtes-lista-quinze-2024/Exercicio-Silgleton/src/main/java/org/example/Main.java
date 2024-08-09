package org.example;

import org.example.library.Book;
import org.example.library.Library;

public class Main {
    public static void main(String[] args) {

        Library library = Library.getInstance();


        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Brave New World", "Aldous Huxley"));
        library.addBook(new Book("Fahrenheit 451", "Ray Bradbury"));


        library.listBooks();
    }
}