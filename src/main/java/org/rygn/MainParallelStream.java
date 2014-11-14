package org.rygn;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;



public class MainParallelStream {

	public static void main(String[] args) {
		
		// init a big list of strings
		int max = 1000000;
		
		List<String> values = new ArrayList<>(max);
		
		System.out.println("Creating list of strings...");
		
		for (int i = 0; i < max; i++) {
		    UUID uuid = UUID.randomUUID();
		    values.add(uuid.toString());
		}
		
		System.out.println("List created !");
		
		// sequential sort
		long t0 = System.nanoTime();

		long count = values.stream().sorted().count();
		System.out.println(count);

		long t1 = System.nanoTime();

		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("Sequential sort took: %d ms", millis));
		
		// parallel sort
		t0 = System.nanoTime();

		count = values.parallelStream().sorted().count();
		System.out.println(count);

		t1 = System.nanoTime();

		millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("Parallel sort took: %d ms", millis));
	}

}
