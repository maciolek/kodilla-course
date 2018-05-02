package com.kodilla.patterns2.adapter.extratask;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAdapterTestSuite {

    @Test
    public void testSortBookClassAdapter() {

        //given
        List<com.kodilla.patterns2.adapter.extratask.BookClassAdapter> bookList = new ArrayList<>();
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookClassAdapter("John Grisham", "The Firm", 1991));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookClassAdapter("Anonim", "The Firm", 2018));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookClassAdapter("Anonim", "The Firm", 2004));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookClassAdapter("John Grisham", "The Pelican Brief", 1992));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookClassAdapter("George R.R. Martin", "A Game of Thrones", 1996));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookClassAdapter("George R.R. Martin", "A Clash of Kings", 1999));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookClassAdapter("George R.R. Martin", "A Storm of Swords", 2000));

        //when
        Collections.sort(bookList);

        //then
        Assert.assertEquals(1999, bookList.get(0).getYearOfPublication());
        Assert.assertEquals(1996, bookList.get(1).getYearOfPublication());
        Assert.assertEquals(2000, bookList.get(2).getYearOfPublication());
        Assert.assertEquals(2004, bookList.get(3).getYearOfPublication());
        Assert.assertEquals(2018, bookList.get(4).getYearOfPublication());
        Assert.assertEquals(1991, bookList.get(5).getYearOfPublication());
        Assert.assertEquals(1992, bookList.get(6).getYearOfPublication());
    }

    @Test
    public void testSortBookObjectAdapter() {
        //given
        List<com.kodilla.patterns2.adapter.extratask.BookObjectAdapter> bookList = new ArrayList<>();
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookObjectAdapter(new Book("John Grisham", "The Firm", 1991)));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookObjectAdapter(new Book("John Grisham", "The Pelican Brief", 1992)));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookObjectAdapter(new Book("George R.R. Martin", "A Game of Thrones", 1996)));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookObjectAdapter(new Book("George R.R. Martin", "A Clash of Kings", 1999)));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookObjectAdapter(new Book("George R.R. Martin", "A Storm of Swords", 2000)));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookObjectAdapter(new Book("Anonim", "The Firm", 2018)));
        bookList.add(new com.kodilla.patterns2.adapter.extratask.BookObjectAdapter(new Book("Anonim", "The Firm", 2004)));

        //when
        Collections.sort(bookList);

        //then
        Assert.assertEquals(1999, bookList.get(0).getBook().getYearOfPublication());
        Assert.assertEquals(1996, bookList.get(1).getBook().getYearOfPublication());
        Assert.assertEquals(2000, bookList.get(2).getBook().getYearOfPublication());
        Assert.assertEquals(2004, bookList.get(3).getBook().getYearOfPublication());
        Assert.assertEquals(2018, bookList.get(4).getBook().getYearOfPublication());
        Assert.assertEquals(1991, bookList.get(5).getBook().getYearOfPublication());
        Assert.assertEquals(1992, bookList.get(6).getBook().getYearOfPublication());
    }
}
