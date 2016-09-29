package by.epam.task2.exercise7.controller;

import by.epam.task2.exercise7.Book;
import by.epam.task2.exercise7.util.LibraryUtil;

/**
 * Created by Davud_Murtazin on 9/29/2016.
 */
public class Controller {

    public static void main(String[] args) {
        LibraryUtil.addBookToArray(new Book("War and Peace", "Tosltoy", 100, 5));
        LibraryUtil.addBookToArray(new Book("Pride And Prejudice", "Jane Ostin", 150, 3));
        LibraryUtil.addBookToArray(new Book("Anna Karenina", "Tolsoy", 130, 4));
        LibraryUtil.addBookToArray(new Book("Fathers and sons", "Turgenyev", 140, 2));
        LibraryUtil.addBookToArray(new Book("Crime and Punishment", "Dostoevsky", 170, 1));

        LibraryUtil.sortBooks();

        for (Book book : LibraryUtil.getBooks()){
            System.out.println(book + "\n");
        }
    }
}
