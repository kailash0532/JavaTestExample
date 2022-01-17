package com.test.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(11);
		set.add(21);
		set.add(31);
		System.out.println(set);
		
		
		set.remove((Integer)10);
		
		System.out.println(set);
		
		
		
		
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
set.clear();
		
		System.out.println(set);
	}

}
