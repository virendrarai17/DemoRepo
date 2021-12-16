package collections.practice;

import java.util.*;

class Dog implements Comparable{
	String name;
	int size;
	Dog(String name, int size){
		this.name=name;
		this.size=size;
	}
	public String toString(){
		return name;
	}
	public int compareTo(Object o){
		return this.size-((Dog)o).size;
	}
}
public class Run3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Dog("Pinky",10));
		al.add(new Dog("Bulldog", 15));
		al.add(new Dog("Ruby", 6));
		System.out.println(al);
		
		//After sorting
	Collections.sort(al);
	System.out.println(al);
	for(Object i:al){
		System.out.println(i);
	}
		
		
		
		
		

	}

}
