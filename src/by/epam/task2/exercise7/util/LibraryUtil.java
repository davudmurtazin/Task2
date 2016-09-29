package by.epam.task2.exercise7.util;

import by.epam.task2.exercise7.entity.Book;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Davud_Murtazin on 9/29/2016.
 */
public class LibraryUtil {
    private static ArrayList<Book> books = new ArrayList<>();

    public static void addBookToArray(Book book){
        books.add(book);
    }

    public static ArrayList<Book> getBooks(){
        return books;
    }

    public static ArrayList<Book> sortBooks(){
        Collections.sort(books);
        return books;
    }
}
