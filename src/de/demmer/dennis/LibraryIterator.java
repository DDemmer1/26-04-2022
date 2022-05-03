package de.demmer.dennis;

import java.util.Iterator;

public class LibraryIterator implements Iterator<Book>{

	private Book[] books;
	
	public LibraryIterator(Book[] books) {
		this.books = books;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book next() {
		// TODO Auto-generated method stub
		return null;
	}

}
