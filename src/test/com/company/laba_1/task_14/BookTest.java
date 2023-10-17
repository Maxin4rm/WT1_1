package test.com.company.laba_1.task_14;

import org.junit.jupiter.api.Test;
import main.com.company.laba_1.task_14.Book;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void givenBook_whenClone_thenReturnCopyOfBook() {
        Book book = new Book("Title", "Author", 123);
        Book bookCopy = (Book) book.clone();
        assertTrue(book != bookCopy && book.equals(bookCopy));
    }
}