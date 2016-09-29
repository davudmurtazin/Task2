package by.epam.task2.exercise8.util;

import by.epam.task2.exercise8.entity.Book;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Davud_Murtazin on 9/29/2016.
 */
public class LibraryUtil {
    private static Set<Book> set;

    public static Set<Book> addBookToLibrary(Comparator<Book> comparator){
        set = new TreeSet<>(comparator);
        set.add(new Book("War and Peace", "Tosltoy", 100));
        set.add(new Book("Pride And Prejudice", "Jane Ostin", 150));
        set.add(new Book("Anna Karenina", "Tolsoy", 130));
        set.add(new Book("Fathers and sons", "Turgenyev", 140));
        set.add(new Book("Crime and Punishment", "Dostoevsky", 170));
        System.out.println("");
        return set;
    }

    public static void getBooks(){
        for ( Book book : set){
            System.out.println(book);
        }
    }
}
