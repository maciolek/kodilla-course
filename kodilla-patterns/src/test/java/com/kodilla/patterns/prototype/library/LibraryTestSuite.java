package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
public class LibraryTestSuite {

    @Test

    public void testGetBooks() {
        //given
        Library library = new Library("Biblioteka publiczna nr 1 - ul. Główna ");
        Book book1 = new Book("Jan Brzechwa", "Oblicza zmyślone", LocalDate.of(1926, 01, 15));
        Book book2 = new Book("Jan Brzechwa", "Talizmany", LocalDate.of(1927, 01, 15));
        Book book3 = new Book("Jan Brzechwa", "Akademia pana Kleksa", LocalDate.of(1946, 01, 15));
        Book book4 = new Book("Jan Brzechwa", "Podróże pana Kleksa", LocalDate.of(1962, 01, 15));
        Book book5 = new Book("Jan Brzechwa", "Na wyspach Bergamutach", LocalDate.of(1948, 01, 15));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //when
        Library clonedShallowCopyLibrary = null;
        try {
            clonedShallowCopyLibrary = library.shallowCopy();
            clonedShallowCopyLibrary.setName("Biblioteka publiczna nr 2 - ul. Płytka");
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }

        Library clonedDeepCopyLibrary = null;
        try {
            clonedDeepCopyLibrary = library.deepCopy();
            clonedDeepCopyLibrary.setName("Biblioteka publiczna nr 3 - ul. Głęboka");
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }

        library.getBooks().remove(book5);

        //then
        System.out.println(library);
        System.out.println(clonedShallowCopyLibrary);
        System.out.println(clonedDeepCopyLibrary);

        Assert.assertEquals(4,library.getBooks().size());
        Assert.assertEquals(4,clonedShallowCopyLibrary.getBooks().size());
        Assert.assertEquals(5,clonedDeepCopyLibrary.getBooks().size());
    }
}

