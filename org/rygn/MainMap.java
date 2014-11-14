package org.rygn;

import java.util.Collection;


public class MainMap extends AbstractMainStream {

	public static void main(String[] args) {
		
		try {
			Collection<String> stringCollection = buildList();
			
			stringCollection
				.stream()
				.map(
					(a) -> a.toUpperCase()
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
