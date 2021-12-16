class MyException1 extends Exception{
	
}



public class UserDefinedException {
	public static void main(String[] args) {
		try {
			throw new MyException1();
		} catch (MyException1 e) {
			System.out.println("caught");
			System.out.println(e.getMessage());
			
		}

	}

}
