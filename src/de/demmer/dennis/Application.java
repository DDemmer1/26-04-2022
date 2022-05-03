package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {

		
		//------------init----------------------------
		
		Book book0 = new Book("3-85768-053-9");
		Book book1 = new Book("978-3-423-34854-6");
		Book book2 = new Book("3-446-17347-1");

		String toDelete = "3-85768-053-9";

		// -----------------Array-for-----------------

		Book[] bookArray = new Book[3];

		bookArray[0] = book0;
		bookArray[1] = book1;
		bookArray[2] = book2;
				
		

		for (int i = 0; i < bookArray.length; i++) {
			Book current = bookArray[i];

			if (current.getISBN().equals(toDelete)) {
				bookArray[i] = null;
			}

		}

		System.out.println(Arrays.toString(bookArray));

		// ------------------for-------------------

		ArrayList<Book> list = new ArrayList<Book>();
		list.add(book0);
		list.add(book1);
		list.add(book2);

		for (int i = 0; i < list.size(); i++) {
			Book current = list.get(i);
			if (current.getISBN().equals(toDelete)) {
				list.remove(current);
			}
		}

		System.out.println(list);

		
		ArrayList<Book> itemsToDelete = new ArrayList<>();
		
		
		
		//--------------for-each-List----------------------
		
		for (Book current : list) {
		
			if (current.getISBN().equals(toDelete)) {
//				list.remove(current);
				itemsToDelete.add(current);
			}
			
		}

		list.removeAll(itemsToDelete);
		
		System.out.println(list);
		
		
		// ---------------------Iterator-for-----------------
		
		     // neue var                                 //Laufzeitbedingung
		for (Iterator<Book> iterator = list.iterator();   iterator.hasNext();          ) {
			
			Book current = iterator.next();
			
			if(current.getISBN().equals(toDelete)) {
				iterator.remove();
			}
		}
		
		System.out.println(list);
		
		
		
		//-------------------Iterator-while------------------
		
		
		Iterator<Book> iterator = list.iterator();
		while(iterator.hasNext()) {
			
			Book current = iterator.next();
			
			if(current.getISBN().equals(toDelete)) {
				iterator.remove();
			}
			
		}
		
		System.out.println(list);
		
	}

}
