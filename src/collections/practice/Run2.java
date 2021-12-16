package collections.practice;

import java.util.*;

public class Run2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(45);
		al.add(25);
		for(Object i:al){
			System.out.println(i);
		}
		//After Sorting element sorted
		Collections.sort(al);
		for(Object i1:al){
			System.out.println(i1);
		}
	}

}
