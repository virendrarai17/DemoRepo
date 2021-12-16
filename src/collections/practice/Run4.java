package collections.practice;

import java.util.*;

public class Run4 {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.add(10);
		q.add(14);
		q.add(9);
		q.add(12);
		System.out.println(q);
		// Poll return all the element by removing head element
		// Peak return all the element including head element
		q.poll();
		System.out.println(q);
		
		while(q.peek()!=null){
			System.out.println(q.poll());
		}
		System.out.println("Size "+ q.size());
		

	}

}
