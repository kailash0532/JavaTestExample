package com.test.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Integer>  treeSet=new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(11);
		treeSet.add(21);
		treeSet.add(31);
		
		System.out.println(treeSet);
		
		System.out.println(treeSet.ceiling(7));
		
		System.out.println(treeSet.floor(7));
		
		System.out.println(treeSet.higher(7));
		
		System.out.println(treeSet.lower(7));
		
		System.out.println(treeSet.headSet(10));
		
		System.out.println(treeSet.tailSet(10));
		
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
		
		System.out.println(treeSet);
		
		Iterator itr=treeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
		
	}
	

}
