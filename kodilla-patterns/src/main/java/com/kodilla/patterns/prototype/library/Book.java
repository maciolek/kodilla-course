package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;
import java.util.Objects;

public final class Book {

    private final String title;
    private final String author;
    private final LocalDate publicationDate;

    public Book(final String title, final String author, final LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "  Autor: " + author + " ,Tytuł: " + title + " , data wydania: " + publicationDate;
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, author, publicationDate);
    }
}