package com.test.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> mapex=new LinkedHashMap<Integer, String>();		
		
		mapex.put(1, "Python");
		
		mapex.put(2, "Java");
		
		mapex.put(10, "C++");
		
		
		mapex.put(5, "C#");
		
		mapex.putIfAbsent(6, "Linux");		
		
		
		System.out.println(mapex);
		mapex.compute(2, (key,value)-> value.concat("Tutorial").toUpperCase());
		
		mapex.computeIfAbsent(9,  value->"Testing2");
		
		mapex.computeIfPresent(9, (key,value)-> value.concat("TTTTTTTTT"));
		
		System.out.println(mapex);
		Map<Integer, String> mapex2=new HashMap<Integer, String>();
		
		mapex2.put(7, "Test");
		
		mapex.putAll(mapex2);
		
		System.out.println(mapex);
		
		System.out.println(mapex.entrySet());
		
		System.out.println(mapex.keySet());
		
		System.out.println(mapex.values());
		
		for(Map.Entry map2 : mapex.entrySet()){
			System.out.println("key is "+ map2.getKey()  + "value is "+ map2.getValue());
		}
		
		mapex.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("compare by values");
		
		
		mapex.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("Reverse Order");
		
		mapex.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
		System.out.println(mapex.remove(5));
		
		System.out.println(mapex);
		mapex.replace(2, "Java All");
		System.out.println(mapex);
		
		
		mapex.replaceAll((key,value)-> value.concat("TTTTTTTTT"));
		System.out.println(mapex);
		
		

	}

}
