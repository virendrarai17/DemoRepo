package collections.practice;

import java.util.*;

public class Run1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(5);
		al.add(2, 50);// Add element based on index
		System.out.println(al);
		System.out.println("Size "+ al.size());
		//iterating by using for each
		for(Object i:al){
			System.out.println(i);
		}

	}

}
