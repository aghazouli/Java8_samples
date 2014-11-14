package java8;

import static org.junit.Assert.*;

import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;

public class TestLambdaExpressionForBuiltInFunctionalInterface {
	
	
	@Test
	public void testPredicate() {
		
		Predicate<String> predicate1 = (s -> s.length() > 0);		
		assertTrue(predicate1.test("foo"));
		
		Predicate<String> predicate2 = (s -> s.length() > 10);
		assertFalse(predicate2.test("foo"));
	}
	
	@Test
	public void testFunction() {
		
		Function<String, Integer> function1 = Integer::valueOf;
		assertEquals((Integer)123, function1.apply("123"));
		
		Function<String, Integer> function2 = from -> Integer.valueOf(from);
		assertEquals((Integer)123, function2.apply("123"));
		
		Function<Integer, Integer> function3 = int1 -> 2*int1;
		assertEquals((Integer)246, function3.apply(123));
	}
}
