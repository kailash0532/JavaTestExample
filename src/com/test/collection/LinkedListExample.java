package com.test.collection;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> list=new LinkedList();

list.add(10);
list.add(20);
list.add(30);
System.out.println(list);
list.addFirst(5);
list.addLast(35);

LinkedList<Integer> list2=new LinkedList();

list2.add(1);
list2.add(2);
list2.add(3);
list.addAll(1, list2);

System.out.println(list);


System.out.println(list.peek());
System.out.println(list.peekFirst());
System.out.println(list.peekLast());

System.out.println(list.poll());
System.out.println(list);



list.remove();

System.out.println(list);


list.push(10);

System.out.println(list);

	}

}
