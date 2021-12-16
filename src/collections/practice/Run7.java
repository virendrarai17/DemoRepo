package collections.practice;

import java.util.*;
// LinkedHashSet preserve the insertion order
public class Run7 {

	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		s.add(10);
		s.add("java");
		s.add("Physics");
		s.add(45);
		System.out.println("Size "+s.size());
		for(Object i:s){
			System.out.println(i);
		}

	}

}
