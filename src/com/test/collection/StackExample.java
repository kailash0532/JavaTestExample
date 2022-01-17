package com.test.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stacks=new Stack<Integer>();
		
		stacks.add(1);
		stacks.add(3);
		
		stacks.push(10);
		stacks.push(2);
		stacks.push(8);
		
		System.out.println(stacks.empty());
		System.out.println(stacks);		
		
		System.out.println(stacks.peek());
		System.out.println(stacks.pop());
		System.out.println(stacks);	
		
		System.out.println(stacks.contains(8));
		System.out.println(stacks.contains(3));
		System.out.println(stacks.search(2));
		
		
		
	}

}
