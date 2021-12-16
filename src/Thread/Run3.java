package Thread;

public class Run3 {

	public static void main(String[] args) throws Exception {
	  Thread t1=new Thread2();
	  t1.start();
	 
	  for(int j=6; j<=10; j++){
		  System.out.println("j"+ j);
	  }
	  try{
		  Thread.sleep(500);
	  }catch(Exception e){
		  System.out.println("main ends");
	  }
		
		
	}}
	class Thread2 extends Thread{
		public void run(){
			for(int i=1; i<=5; i++){
				System.out.println("i"+ i);
			}
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println("Run ends");
			}
		}
	
	
	}


