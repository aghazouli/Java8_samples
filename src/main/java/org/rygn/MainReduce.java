package org.rygn;

import java.util.Collection;
import java.util.Optional;


public class MainReduce extends AbstractMainStream {

	public static void main(String[] args) {
		
		try {
			Collection<String> stringCollection = buildList();
			
			Optional<String> mapReduceResult = stringCollection
													.stream()
													.sorted()
													.map(
														a-> a.toUpperCase()
													)
													.reduce(
														(a, b) -> a + "#" + b
													);
			
			System.out.println("MapReduce result : " + mapReduceResult);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
