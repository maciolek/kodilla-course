package com.kodilla.patterns2.adapter.extratask;

public class BookObjectAdapter implements Comparable<Book> {

   Book book;

    public BookObjectAdapter(Book book) {
        this.book = book;
    }

    @Override
    public int compareTo(Book o) {
        return BookComparators.ALLFIELDS.compare(book, o);
    }

    public Book getBook() {
        return book;
    }
}
