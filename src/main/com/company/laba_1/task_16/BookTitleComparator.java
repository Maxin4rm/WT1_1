package main.com.company.laba_1.task_16;

import main.com.company.laba_1.task_12.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
