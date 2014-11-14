package java8;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.rygn.Converter;

public class TestLambdaExpressionForFunctionalInterface {
	
	private Converter<String, Integer> converter;
	
	@Before
	public void init() {
		
		this.converter = from ->  {
			
			Integer result = -1;
			
			if (from != null) {
				
				result = from.length();
			}
			
			return result;
		};
	}
	
	@Test
	public void testConvert() {
		
		assertEquals((Integer)3, this.converter.convert("123"));
	}
}
