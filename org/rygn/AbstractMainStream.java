package org.rygn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AbstractMainStream {

	protected static Collection<String> buildList() {
		
		List<String> stringCollection = new ArrayList<>();		
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		
		return stringCollection;
	}
}
