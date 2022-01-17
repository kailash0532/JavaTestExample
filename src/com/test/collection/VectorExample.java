package com.test.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> vec=new Vector();
		vec.add(10);
		vec.addElement(20);	
		
		vec.add(0, 30);
		
		System.out.println(vec);
		Vector<Integer> vec4=new Vector();
		vec4.add(80);
	//	Object vec2=new Vector();
	//	vec2=vec.clone();		
	//	System.out.println(vec2);
		
	//	vec.clear();
	//	System.out.println(vec);
		
		
		Vector<Integer> vec3=new Vector();
		vec3.add(40);
		vec3.add(50);
		vec3.add(60);
		vec3.set(0, 25);
		vec.addAll(vec3);
		System.out.println(vec);
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		System.out.println(vec.contains(20));
		System.out.println(vec.containsAll(vec4));
		
		System.out.println("Hash code"+vec.hashCode());
		
		
		vec.remove(1);
		System.out.println(vec);
		
		System.out.println(vec.remove((Integer)40));
		System.out.println(vec);
		
		
		Iterator itr=vec.listIterator();
		System.out.println("printing using for Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("printing using for each loop");
		
		for(Integer vect : vec ) {
			System.out.println(vect);
		}
		
		System.out.println("printing using for loop");
		for (int i=0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}
		
	}
}
