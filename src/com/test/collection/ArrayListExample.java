package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ArrayList arrayList=new ArrayList();
		 * 
		 * arrayList.add(1); arrayList.add(2.0); arrayList.add("Test");
		 * arrayList.add(true);
		 */
		
		List<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		
		System.out.println(arrayList);
		
		Iterator itr =arrayList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			arrayList.add(4);
		}
		
		
		for(int a: arrayList) {
			System.out.println("for each "+a);
		}
		
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		ListIterator<Integer> listItr=arrayList.listIterator(arrayList.size());
		System.out.println("Reverse Order");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
			
		}
		System.out.println("Original Order");
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
			
		}
		
	//	ArrayList<ArrayList<Integer> > arrayList1=new ArrayList<ArrayList<Integer> >();	
	//	arrayList1.add(arrayList);
	//	System.out.println(arrayList1);
		
		arrayList.add(1, 10);
		
		System.out.println(arrayList);
		
		
		arrayList.set(1, 20);
		System.out.println(arrayList);
		
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		arrayList2.add(30);
		arrayList2.addAll(arrayList);
		System.out.println(arrayList2);
	//	arrayList2.clear();
	//	System.out.println(arrayList2);
		
	//	arrayList2.remove(1);
	//	System.out.println(arrayList2);
		
//		arrayList2.removeAll(arrayList);
//		System.out.println(arrayList2);c
		
		
	//	arrayList2.removeIf(num -> (num<=2));
	//	System.out.println(arrayList2);
		
		Collections.sort(arrayList2);
		System.out.println(arrayList2);
		
		Collections.reverse(arrayList2);
		
		System.out.println(arrayList2);
		
		
		arrayList2.replaceAll(num -> num+2);
		
		System.out.println(arrayList2);
		
		ArrayList<String> arrayList3=new ArrayList<String>();
		arrayList3.add("test1");
		arrayList3.add("test2");
		arrayList3.add("test3");
		arrayList3.replaceAll(str-> str.toUpperCase());
		System.out.println(arrayList3);
	}

}
