package org.rygn;




public class MainFunctionalInterface {

	public static void main(String[] args) {
		
		Converter<String, Integer> converter = from -> Integer.valueOf(from);
		
		// Converter<String, Integer> converter = new ConverterRealImplementation();
		
		Integer converted = converter.convert("123");
		
		System.out.println(converted);
	}

}
