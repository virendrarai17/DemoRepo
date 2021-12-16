package collections.practice;

import java.util.*;

public class Run5 {

	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		q.add(10);
		q.add(6);
		q.add(13);
		q.add(4);
		System.out.println(q);
		System.out.println("Size "+ q.size());
		while(q.peek()!=null){
			System.out.println(q.poll());
		}

	}

}
