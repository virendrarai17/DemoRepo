class Rectangle{
	int length;
	int bredth;
	
	void intialize(int b, int l){
		this.bredth=b;
		this.length=l;
	}
	void printDimention(){
		System.out.println("Rectanle lengthe"+ length+ ","+ "Rectangle breadth"+ bredth);
	}
}

public class Run2 {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		r1.intialize(10,20);
		r1.printDimention();
		
		
		
		

	}

}
