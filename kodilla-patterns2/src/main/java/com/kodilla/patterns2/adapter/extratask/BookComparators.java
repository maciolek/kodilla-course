package com.kodilla.patterns2.adapter.extratask;

import java.util.Comparator;

public class BookComparators {

    public static final Comparator<Book> TITLE = (Book b1, Book b2) -> b1.getTitle().compareTo(b2.getTitle());
    public static final Comparator<Book> AUTHOR = (Book b1, Book b2) -> b1.getAuthor().compareTo(b2.getAuthor());
    public static final Comparator<Book> YEAROFPUBLICATION = (Book b1, Book b2) -> Integer.compare(b2.getYearOfPublication(), b2.getYearOfPublication());

    public static final Comparator<Book> ALLFIELDS =
            Comparator.comparing((Book b) -> b.getTitle())
                    .thenComparing(b -> b.getAuthor())
                    .thenComparingInt(b -> b.getYearOfPublication());
}
