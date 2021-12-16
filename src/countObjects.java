public class countObjects {
	static int count=0;
	
	countObjects(){
		count++;
		}
	countObjects(int i){
		count++;	
	}
	
	public static void main(String[] args) {
		countObjects c1=new countObjects();
		countObjects c2=new countObjects();
		countObjects c3=new countObjects(10);
		System.out.println("Number of Objectscount "+ count);

	}

}
