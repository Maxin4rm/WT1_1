package main.com.company.laba_1.task_16;

import main.com.company.laba_1.task_12.Book;

import java.util.Comparator;

public class BookAuthorTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        int authorCompare = b1.getAuthor().compareTo(b2.getAuthor());
        if (authorCompare == 0) {
            return b1.getTitle().compareTo(b2.getTitle());
        }
        return authorCompare;
    }
}
