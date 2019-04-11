package com.lqp.Iterator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BookShelf bookShelf=new BookShelf();

        bookShelf.appendBook(new Book("java"));
        bookShelf.appendBook(new Book("c"));
        bookShelf.appendBook(new Book("c#"));
        bookShelf.appendBook(new Book("c++"));
        bookShelf.appendBook(new Book("python"));
        Iterator it=bookShelf.iterator();
        while(it.hasNext())
        {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }




    }
}
