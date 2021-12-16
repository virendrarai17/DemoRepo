interface Car1{
	void start();
	void move();
	void stop();
}

class BMW implements Car1{
	public void start(){
		System.out.println("BMW starts");
	}
	public void move(){
		System.out.println("BMW move");
	}
	public void stop(){
		System.out.println("BMW stop");
	}
}

class Nano implements Car1{
	public void start(){
		System.out.println("Nano starts");
	}
	public void move(){
		System.out.println("Nano move");
	}
	public void stop(){
		System.out.println("Nano stop");
	}
	
}

class Driver1{
	void Drive(Car1 c){
		c.start();
		c.stop();
		c.move();
	}
}
public class Run5 {

	public static void main(String[] args) {
		Driver1 d=new Driver1();
		d.Drive(new BMW());
		d.Drive(new Nano());
		
		

	}

}
