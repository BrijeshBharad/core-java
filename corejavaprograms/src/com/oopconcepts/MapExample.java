package com.oopconcepts;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("C", 300);
		map.put("D", 200);
		map.put("", 800);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);
			// does not take duplicate keys
			// does not take null key
		}
	}

}
