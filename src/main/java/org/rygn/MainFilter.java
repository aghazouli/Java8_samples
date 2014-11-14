package org.rygn;

import java.util.Collection;


public class MainFilter extends AbstractMainStream {

	public static void main(String[] args) {
		
		try {
			Collection<String> stringCollection = buildList();
			
			stringCollection
				.stream()
				.filter(
					s -> s.startsWith("a")
				)
				.forEach(
					s -> System.out.println("Found : " + s)
				);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
