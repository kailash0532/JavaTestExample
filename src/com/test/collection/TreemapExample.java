package com.test.collection;

import java.util.TreeMap;

public class TreemapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tmap=new TreeMap<Integer, String>();
		tmap.put(1, "one");
		tmap.put(3, "three");
		tmap.put(2, "two");
		tmap.put(6, null);		
		System.out.println(tmap);
		
		
		
		System.out.println(tmap.ceilingKey(4));
		System.out.println(tmap.floorKey(4));
		
		System.out.println(tmap.ceilingEntry(4));
		System.out.println(tmap.firstEntry());
		
		System.out.println(tmap.lastEntry());
		System.out.println(tmap.pollLastEntry());
		System.out.println(tmap);
		
	}

}
