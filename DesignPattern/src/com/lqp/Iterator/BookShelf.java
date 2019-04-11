package com.lqp.Iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate{
    private ArrayList<Book> books = new ArrayList<Book>();  //存储图书
    private int last=0;             //指向图书列表的最后一本书

    public Book getBookAt(int index)
    {
        return books.get(index);
    }

    public void appendBook(Book book)
    {
        books.add(book);
        last++;
    }

    public int getLength()
    {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
