package org.rygn;

import java.util.Collection;
import java.util.stream.Stream;


public class MainCount extends AbstractMainStream {

	public static void main(String[] args) {
		
		try {
			Collection<String> stringCollection = buildList();
			
			Stream<String> myStream = stringCollection.stream();
			
			Long count = myStream
								.filter(
									(a) -> a.startsWith("a")
								)
								.count();
			
			System.out.println("Nbr starting with a : " + count);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
