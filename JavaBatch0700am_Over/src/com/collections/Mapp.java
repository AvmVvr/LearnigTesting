package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapp {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("StuId", 1001);
		m.put("emmid", 2001);
		m.put("instaid", 3001);
		m.put("fbid", 4001);
		m.put("twitterid", 5001);
		System.out.println(m);
		Integer Value = m.get("fbid");
		System.out.println(Value);
		// keyset
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		// values
		Collection<Integer> values = m.values();
		System.out.println(values);
		boolean containsKey = m.containsKey("emailid");
		System.out.println(containsKey);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		m.remove("twitterid");
		System.out.println(m);
		int size = m.size();
		System.out.println(size);
		m.clear();
		System.out.println(m);
	}
}