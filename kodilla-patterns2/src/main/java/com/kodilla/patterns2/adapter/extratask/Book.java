package com.kodilla.patterns2.adapter.extratask;

public class Book {

    private String author;
    private String title;
    private int yearOfPublication;

    public Book() {
    }

    public Book(final String author, final String title, final int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book: " +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                "\n";
    }
//    public int compareTo(int i) {
//        return i;
//    }

}
