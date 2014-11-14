package java8;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.rygn.Converter;
import org.rygn.ConverterRealImplementation;

public class TestFunctionalInterface {
	
	private Converter<String, Integer> converter;
	
	@Before
	public void init() {
		
		this.converter = new ConverterRealImplementation();
	}
	
	@Test
	public void testConvert() {
		
		assertEquals((Integer)3, this.converter.convert("123"));
	}
}
