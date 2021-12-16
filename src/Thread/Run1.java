package Thread;
// Creating a Thread by extending Thread class
public class Run1 {

	public static void main(String[] args) {
		Thread t1=new Thread1();
		t1.start();
		System.out.println("main Start");
		for(int j=11; j<=20; j++){
		System.out.println("J ="+ j);
		
		try{
			Thread.sleep(500);
		}catch(Exception e){
        System.out.println("main Ends");
		}}}}
	class Thread1 extends Thread{
		public void run(){
			System.out.println("Thread1 started");
			for(int i=1; i<=10; i++){
				System.out.println("i ="+ i);
				try{
					Thread.sleep(500);
				}catch(Exception e){
					System.out.println("Thread1 ends");
				}}}
}