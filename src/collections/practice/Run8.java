package collections.practice;

import java.util.ArrayList;
// Generic Type
class Dog1{
	 void makeSound(){
		 System.out.println("Bow Bow");
	 }
}

public class Run8 {
 
	public static void main(String[] args) {
	
		ArrayList<Dog1> al=new ArrayList<Dog1>();
		al.add(new Dog1());
		al.get(0).makeSound();

	}

}
