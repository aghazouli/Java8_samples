package org.rygn;

import java.util.Collection;


public class MainMatch extends AbstractMainStream {

	public static void main(String[] args) {
		
		try {
			Collection<String> stringCollection = buildList();
			
			Boolean anyMatchResult = stringCollection
										.stream()
										.anyMatch(
											(a) -> a.startsWith("a")
										);
			
			System.out.println("AnyMatchResult : " + anyMatchResult);
			
			
			Boolean allMatchResult = stringCollection
					.stream()
					.allMatch(
						(a) -> a.startsWith("a")
					);

			System.out.println("AllMatchResult : " + allMatchResult);
			
			
			Boolean noneMatchResult = stringCollection
					.stream()
					.noneMatch(
						(a) -> a.startsWith("a")
					);

			System.out.println("NoneMatchResult : " + noneMatchResult);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
