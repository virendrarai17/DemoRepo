package collections.practice;

import java.util.*;
// HashSet Returns the element in random order.Element inserted in the form of bucket
public class Run6 {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(10);
		s.add("Java");
		s.add("Maths");
		s.add(20);
		System.out.println("Size "+s.size());
		for(Object i:s){
			System.out.println(i);
		}

	}

}
