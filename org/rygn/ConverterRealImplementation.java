package org.rygn;

public class ConverterRealImplementation implements Converter<String, Integer> {

	@Override
	public Integer convert(String from) {
		
		return Integer.valueOf(from);
	}

}
