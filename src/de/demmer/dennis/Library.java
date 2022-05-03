package de.demmer.dennis;

import java.util.Iterator;

public class Library implements Iterable<Book> {

	Book[] books;

	@Override
	public Iterator<Book> iterator() {

		Iterator<Book> bookIterator = new LibraryIterator(books);
		return bookIterator;
	}

	
}
