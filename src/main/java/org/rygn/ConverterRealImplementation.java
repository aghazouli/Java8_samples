package org.rygn;

public class ConverterRealImplementation implements Converter<String, Integer> {

	@Override
	public Integer convert(String from) {
		
		Integer result = -1;
		
		if (from != null) {
			
			result = from.length();
		}
		
		return result;
	}

}
