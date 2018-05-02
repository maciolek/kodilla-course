package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookSatatistic {

    int averagePublicationYear(Map<BookSignature, Book> books);

    int medianaPublicationYear(Map<BookSignature, Book> books);
}
