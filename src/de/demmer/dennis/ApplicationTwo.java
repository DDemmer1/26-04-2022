package de.demmer.dennis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class ApplicationTwo {
	
	public static void main(String[] args) {
				
		LinkedList<Integer> intListe = new LinkedList<Integer>();
		
		for (int i = 0; i < 1000; i++) {
			int zahl = new Random().nextInt(101);
			intListe.add(zahl);
		}
		
		Iterator<Integer> iterator = intListe.iterator();
		
		while(iterator.hasNext()) {
			
			int current = iterator.next();
			
			if(current > 50) {
				iterator.remove();
			}
		}
		
		System.out.println(intListe);
		System.out.println(intListe.size());
		
		
		
		
	}

}
