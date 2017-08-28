package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("apple", 0);
		map.put("orange", 3);
		map.put("banana", 2);
		map.put("strawberry", 1);
		map.put("mango", 3);
		
		sortMap(map);

	}
	
	public static void sortMap(Map<String, Integer> map){
		System.out.println(map);
		
		List<String> list = new ArrayList<String>();
		list.addAll(map.keySet());		
		System.out.println(list);
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		for (String key : list){
			treeMap.put(key, map.get(key));
		}
		
		System.out.println(treeMap);
	}

}
