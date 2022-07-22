package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapp {
	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<>();
		System.out.println(m);

		m.put("Physics", null);
		m.put("Chemistry", null);
		m.put("Maths", null);
		m.put(null, 00);// 00 ===>science
		m.put(null, 98);

		System.out.println("-----------");
		System.out.println(m);

		Set<String> keySet = m.keySet();
		System.out.println(keySet);

		Collection<Integer> values = m.values();
		System.out.println(values);

		Set<Entry<String, Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);

		boolean containsKey = m.containsKey("orange");
		System.out.println(containsKey);

		boolean containsValue = m.containsValue(2);
		System.out.println(containsValue);

		Integer integer = m.get("science");
		System.out.println(integer);

		int hashCode = m.hashCode();
		System.out.println(hashCode);

		m.replace("science", 98);
		System.out.println(m);

		m.remove("Apple", 1);
		System.out.println(m);

		m.remove("science");
		System.out.println(m);

		m.clear();
		System.out.println(m);

	}

}
