package by.epam.task2.exercise8.controller;

import by.epam.task2.exercise8.Book;
import by.epam.task2.exercise8.util.LibraryUtil;

import java.util.Comparator;

/**
 * Created by Davud_Murtazin on 9/29/2016.
 */
public class Controller {

    public static void main(String[] args) {
        Comparator<Book> titleComp = (left, right) -> left.getTitle().compareTo(right.getTitle()); //lambda comparator
        Comparator<Book> titleAuthorComp = Comparator.comparing(Book::getTitle).thenComparing(Book::getAuthor);// can use this kind of comparator from JDK 8
        Comparator<Book> authorTitleComp = Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle);
        Comparator<Book> titleAuthorPriceComp = Comparator.comparing(Book::getTitle).thenComparing(Book::getAuthor).thenComparing(Book::getPrice);

        LibraryUtil.addBookToLibrary(titleComp);
        LibraryUtil.getBooks();

        LibraryUtil.addBookToLibrary(authorTitleComp);
        LibraryUtil.getBooks();
    }
}
