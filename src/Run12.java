import java.util.Arrays;

class Book implements Comparable{
	String title;
	int page;
	Book(String title, int page){
		this.title=title;
		this.page=page;
	}
	public String toString(){
		return title;
	}
	public int compareTo(Object o){
		return this.page-((Book)o).page;
	}
}
public class Run12 {
	public static void main(String[] args) {
		Book [] b=new Book[3];
		b[0]=new Book("java", 20);
		b[1]=new Book("eng", 25);
		b[2]=new Book("Maths", 24);

		Arrays.sort(b);
		
	for(Book a:b){
		System.out.println(a);
	}
	
	
	
}}
