package org.rygn;

import java.util.Collection;


public class MainForEach extends AbstractMainStream {

	public static void main(String[] args) {
		
		try {
			Collection<String> stringCollection = buildList();
			
			/*			 
			for (String s : stringCollection) {
				
				System.out.println(s);
			}
			*/
			
			
			stringCollection
				.stream()
				.forEach(
					(a) -> System.out.println("Found : " + a)
				);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
