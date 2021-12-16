import java.util.ArrayList;
import java.util.Collections;

class Dogy implements Comparable{
	int age;
	String name;
	Dogy(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return name;
	}
	public int compareTo(Object o){
		return this.age-((Dogy)o).age;
	}
}
public class practiceA {
	   public static void main(String args[]) { 
		 ArrayList al=new ArrayList();
		 al.add(new Dogy("pinkk", 10));
		 al.add(new Dogy("fsf",4));
		 al.add(new Dogy("fsfsd",7));
		 System.out.println(al);
		 
		 Collections.sort(al);
		 for(Object i:al)
		 {
			 System.out.println(i);
		 }
		 
	  	   }}