package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Iterator<Book> iterator = bookSet.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            bookMap.put(new BookSignature(book.getSignature()), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianaPublicationYear(bookMap);
    }
}
