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
									a -> a.length() >= 5
								)
								.count();
			
			System.out.println("Nbr with size >= 5 : " + count);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
