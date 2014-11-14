package org.rygn;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class MainBuiltInFunctionalInterface {

	public static void main(String[] args) {
		
		Supplier<Person> personSupplier = Person::new;
		Person p = personSupplier.get();
		System.out.println("Person supplied : " + p);
		
		Consumer<Person> greeter = (a) -> System.out.println("Hello, " + a.getFirstName());
		greeter.accept(new Person("Luke", "Skywalker"));
		
		Comparator<Person> comparator = 
				(p1, p2) -> {
					if (p1.getLastName().compareTo(p2.getLastName()) != 0) {
						
						return p1.getLastName().compareTo(p2.getLastName());
					}
					else {
						return p1.getFirstName().compareTo(p2.getFirstName());
					}
				};
				
		Person p1 = new Person("John", "Doe");
		Person p2 = new Person("Alice", "Wonderland");
		
		System.out.println("p1 compared to p2 : " + comparator.compare(p1, p2));
		
	}

}
