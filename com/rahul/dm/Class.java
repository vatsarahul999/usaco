package com.rahul.dm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Class  {
	
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("in C");
	}
	
	public static void main(String[] args) {
		ArrayList<B> a = new ArrayList<>();
		a.add(new B());
		ArrayList b = a;
		ArrayList<C> c = (ArrayList<C>) b;
		c.add(new C());
		for(Object o : b)
			System.out.println(o);
		int n=1000;
	int x =  (n&(1<<3))>>3;
	System.out.println(x);	
	}
	

}
 class A{
};
class B extends A {


	
};
class C extends A{}
