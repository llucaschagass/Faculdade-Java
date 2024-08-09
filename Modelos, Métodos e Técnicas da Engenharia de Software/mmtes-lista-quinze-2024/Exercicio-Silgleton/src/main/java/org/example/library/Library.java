package org.example.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books;

    private Library() {
        books = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Livro adicionado: " + book);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Nenhum livro disponível.");
        } else {
            System.out.println("Lista de livros na biblioteca:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
