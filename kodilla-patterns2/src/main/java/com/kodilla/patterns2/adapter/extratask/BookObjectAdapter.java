package com.kodilla.patterns2.adapter.extratask;

import java.util.Comparator;

public class BookObjectAdapter implements Comparable<BookObjectAdapter> {

    private final Book book;

    public BookObjectAdapter(final Book book) {
        this.book = book;
    }
    @Override
    public int compareTo(BookObjectAdapter boa) {
        return Comparator.comparing((Book book) -> book.getTitle())
                .thenComparing(b -> b.getAuthor())
                .thenComparingInt(b -> b.getYearOfPublication())
                .compare(this.getBook(), boa.getBook());
    }
    public Book getBook() {
        return book;
    }
}

