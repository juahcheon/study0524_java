package com.mycompony.study.ch15.forth;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();	
		Map<String, String> map2 = new HashMap<>();	
		HashMap<String, Integer> hashmap = new HashMap<>();
	
		map.put("최승철",100);
		map2.put("윤정한", "100");
		
		System.out.println(map.get("최승철"));
		
		map.remove("최승철");
		map.clear();
		
		System.out.println(map.get("최승철"));
		
		for(String strKey : map.keySet()) {
			Integer strValue = map.get(strKey);
			System.out.println(strKey + ":" + strValue);
		}
	}
}
