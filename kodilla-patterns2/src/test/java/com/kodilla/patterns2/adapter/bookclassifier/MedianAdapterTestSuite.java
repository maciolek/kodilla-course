package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        bookSet.add(new Book("John Grisham", "The firm", 1991, "1001"));
        bookSet.add(new Book("John Grisham", "The Pelican Brief", 1992, "1002"));
        bookSet.add(new Book("George R.R. Martin", "A Game of Thrones", 1996, "1003"));
        bookSet.add(new Book("George R.R. Martin", "A Clash of Kings", 1999, "1004"));
        bookSet.add(new Book("George R.R. Martin", "A Storm of Swords", 2000, "1005"));
        //when

        int medianPublisherYear = medianAdapter.publicationYearMedian(bookSet);
        //then
        Assert.assertEquals(1996, medianPublisherYear);
    }
}
