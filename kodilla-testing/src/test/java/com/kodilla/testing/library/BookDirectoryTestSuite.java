package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {

    public List<Book> generateListOfNBooksNumber(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int i = 0; i < booksQuantity; i++) {
            Book theBook = new Book("Title " + i, "Author " + i, 1905 + i);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);

        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);

        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);

        when(libraryDatabase.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //when
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //then
        Assert.assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> listOfBook0 = new ArrayList<>();
        List<Book> listOfBook15 = generateListOfNBooksNumber(15);
        List<Book> listOfBook40 = generateListOfNBooksNumber(40);
        when(libraryDatabase.listBooksWithCondition(anyString())).thenReturn(listOfBook15);
        when(libraryDatabase.listBooksWithCondition("ZeroBooks")).thenReturn(listOfBook0);
        when(libraryDatabase.listBooksWithCondition("FourtyBooks")).thenReturn(listOfBook40);
        //when
        List<Book> theListOfBook0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBook15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBook40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        //then
        Assert.assertEquals(0, theListOfBook0.size());
        Assert.assertEquals(15, theListOfBook15.size());
        Assert.assertEquals(0, theListOfBook40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultOFBook10 = generateListOfNBooksNumber(10);
        when(libraryDatabase.listBooksWithCondition(anyString())).thenReturn(resultOFBook10);
        //when
        List<Book> resultListOfBooks0 = bookLibrary.listBooksWithCondition("AN");
        //then
        Assert.assertEquals(0, resultListOfBooks0.size());
    }
    @Test
    public void testlistBooksInHandsOf() {
        //given
        LibraryDatabase libraryDatabase =mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUserNonBooks = new LibraryUser("Antek","Trol", "82101515798");
        LibraryUser libraryUser1Book = new LibraryUser("Jan", "Szolc", "50808015797");
        LibraryUser libraryUser5Book = new LibraryUser("Ewa", "Zielińska", "75101578797");

        List<Book> listOfLendBooks0 = new ArrayList<>();
        List<Book> listOfLendBooks1 = generateListOfNBooksNumber(1);
        List<Book> listOfLendBooks5 = generateListOfNBooksNumber(5);

        when(libraryDatabase.listBooksInHandsOf(libraryUserNonBooks)).thenReturn(listOfLendBooks0);
        when(libraryDatabase.listBooksInHandsOf(libraryUser1Book)).thenReturn(listOfLendBooks1);
        when(libraryDatabase.listBooksInHandsOf(libraryUser5Book)).thenReturn(listOfLendBooks5);

        //when
        List<Book> resultList0 = bookLibrary.listBooksInHandsOf(libraryUserNonBooks);
        List<Book> resultList1 = bookLibrary.listBooksInHandsOf(libraryUser1Book);
        List<Book> resultList5 = bookLibrary.listBooksInHandsOf(libraryUser5Book);
        //then
        Assert.assertEquals(0,resultList0.size());
        Assert.assertEquals(1,resultList1.size());
        Assert.assertEquals(5,resultList5.size());
      }
}

