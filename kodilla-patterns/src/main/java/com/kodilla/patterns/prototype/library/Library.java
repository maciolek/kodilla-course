package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class Library extends Prototype {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("Library [" + name + "]\n");
        for (Book theBook : books) {
            sb = sb.append(theBook.toString() + "\n");
        }
        return sb.toString();
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        clonedLibrary.books.addAll(getBooks());
        return clonedLibrary;
    }
}
