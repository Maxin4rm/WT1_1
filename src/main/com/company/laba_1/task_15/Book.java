package main.com.company.laba_1.task_15;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + price + " " + isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, isbn);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.getClass() == this.getClass() &&
                ((Book)obj).isbn == this.isbn &&
                ((Book)obj).title.equals(this.title) &&
                ((Book)obj).author.equals(this.author) &&
                ((Book)obj).price == this.price;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.isbn, other.isbn);
    }
}
