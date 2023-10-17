package test.com.company.laba_1.task_16;

import org.junit.jupiter.api.Test;
import main.com.company.laba_1.task_12.Book;
import main.com.company.laba_1.task_16.BookAuthorTitleComparator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookAuthorTitleComparatorTest {

    @Test
    void givenBooksWithDifferentAuthors_whenSortWithBookAuthorTitleComparator_thenReturnSortedByAuthor() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title1", "a5", 0),
                new Book("title2", "a4", 0),
                new Book("title3", "a3", 0),
                new Book("title4", "a1", 0),
                new Book("title5", "a2", 0))
        );
        List<Book> expected = List.of(
                books.get(3), books.get(4), books.get(2), books.get(1), books.get(0)
        );
        books.sort(new BookAuthorTitleComparator());
        assertIterableEquals(expected, books);
    }

    @Test
    void givenBooksWithSameAuthors_whenSortWithBookAuthorTitleComparator_thenReturnSortedByAuthorThenByTitle() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title1", "a2", 0),
                new Book("title2", "a4", 0),
                new Book("title3", "a1", 0),
                new Book("title4", "a1", 0),
                new Book("title5", "a2", 0)
        ));
        List<Book> expected = List.of(
                books.get(2), books.get(3), books.get(0), books.get(4), books.get(1)
        );
        books.sort(new BookAuthorTitleComparator());
        assertIterableEquals(expected, books);
    }

    @Test
    void givenBooksWithAllSameAuthors_whenSortWithBookAuthorTitleComparator_thenReturnSortedByTitle() {
        List<Book> books = new ArrayList<>(List.of(
                new Book("title5", "author", 0),
                new Book("title4", "author", 0),
                new Book("title3", "author", 0),
                new Book("title2", "author", 0),
                new Book("title1", "author", 0))
        );
        List<Book> expected = List.of(
                books.get(4), books.get(3), books.get(2), books.get(1), books.get(0)
        );
        books.sort(new BookAuthorTitleComparator());
        assertIterableEquals(expected, books);
    }
}