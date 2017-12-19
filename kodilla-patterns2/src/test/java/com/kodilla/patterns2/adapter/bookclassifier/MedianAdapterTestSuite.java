package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("xxx","yyy",1986,"345");
        Book book2 = new Book("xyx","xyy",1989,"125");
        Book book3 = new Book("xxy","yxy",1991,"355");
        Book book4 = new Book("yxx","yyx",1996,"675");
        Book book5 = new Book("yyx","xyx",1998,"695");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int medianaA = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(medianaA,1991);
    }
}
