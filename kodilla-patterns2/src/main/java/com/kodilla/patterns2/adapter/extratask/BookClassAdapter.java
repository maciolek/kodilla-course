package com.kodilla.patterns2.adapter.extratask;

public class BookClassAdapter extends Book implements Comparable<Book> {

    public BookClassAdapter(String author, String title, int yearOfPublication) {
        super(author, title, yearOfPublication);
    }

    @Override
    public int compareTo(Book o) {
        return BookComparators.ALLFIELDS.compare(this, o);
    }
}
