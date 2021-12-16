class Rectangle1{
	int height;
	int breadth;
	Rectangle1(int h, int b){
		this.height=height;
		this.breadth=breadth;
	}
	public boolean equals(Object o){
		return this.height==((Rectangle1)o).height && this.breadth==((Rectangle1)o).breadth;
	}
}

public class Run7 {

	public static void main(String[] args) {
		Rectangle1 r1=new Rectangle1(10,20);
		Rectangle1 r2=new Rectangle1(18,15);
		System.out.println(r1.equals(r2));
		
		
		

	}

}
