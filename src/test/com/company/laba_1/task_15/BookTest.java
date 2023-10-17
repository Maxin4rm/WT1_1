package test.com.company.laba_1.task_15;

import org.junit.jupiter.api.Test;
import main.com.company.laba_1.task_15.Book;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void givenArrayOfBooks_whenSort_thenReturnBooksSortedByIsbn() {
        Book[] books = new Book[] {
                new Book("1", "1", 100, 5),
                new Book("2", "1", 100, 3),
                new Book("3", "1", 100, 1),
                new Book("4", "1", 100, 4),
                new Book("5", "1", 100, 2)
        };
        Book[] expected = new Book[] {
                books[2], books[4], books[1], books[3], books[0]
        };
        Arrays.sort(books);
        assertArrayEquals(expected, books);
    }
}