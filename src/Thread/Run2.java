package Thread;
//Creating Thraed by implementing Runnable interface
public class Run2 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		new Thread(new Runnable1()).start();
		for(int j=11; j<=20; j++){
			System.out.println("j ="+ j);
		try{
			Thread.sleep(500);
			
		}catch(Exception e){
			System.out.println("Thread Ends");
		}

	}}}

class Runnable1 implements Runnable{
	public void run(){
		System.out.println("Runnable Starts");
		for(int i=1; i<=10; i++){
			System.out.println("i ="+ i);
		try{
			Thread.sleep(500);
		}catch(Exception e){
			System.out.println("Runable ends");
		}
	}
	}}
