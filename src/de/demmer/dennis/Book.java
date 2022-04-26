package de.demmer.dennis;

public class Book {
	
	private String ISBN;
	
	
	public Book(String iSBN) {
		super();
		ISBN = iSBN;
	}
	

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + "]";
	}
	
	
}
