package com.OopConcepts;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> firstMap = new HashMap<String, Integer>();

		firstMap.put("a", 100);
		firstMap.put("b", 200);
		firstMap.put("c", 300);
		firstMap.put("c", 300);
		firstMap.put("d", 200);
		firstMap.put("", 800);
		for (Map.Entry<String, Integer> entry : firstMap.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);
			// does not take duplicate keys
		}
	}

}
