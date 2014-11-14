package org.rygn;

import java.util.Collection;


public class MainFilter extends AbstractMainStream {

	public static void main(String[] args) {
		
		try {
			Collection<String> stringCollection = buildList();
			
			stringCollection
				.stream()
				.filter(
					(a) -> a.startsWith("a")
				)
				.forEach(
					(a) -> System.out.println("Found : " + a)
				);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
