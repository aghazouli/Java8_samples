package org.rygn;

import java.time.ZoneId;
import java.util.Set;



public class MainZoneId {

	public static void main(String[] args) {
		
		try {
			Set<String> zoneIds = ZoneId.getAvailableZoneIds();
			
			for (String zoneId : zoneIds) {
				
				ZoneId zone = ZoneId.of(zoneId);
				
				System.out.println(zoneId + " : " + zone.getRules());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
