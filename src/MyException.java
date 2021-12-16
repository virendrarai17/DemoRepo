/* How to create an exception
 * create a class and extend object class Exception present in java.lang package
 * use try catch block, in try block throw an object of user defined exception
 * in catch block catch the exception
 * */

class demoException extends Exception{
	public demoException(String s){
		super(s);
	}
}
public class MyException {

	public static void main(String[] args) {
		try {
			throw new demoException("Viren"); 
		} catch (demoException e) {
			System.out.println("Caught");
			// print the message of demoexception
			System.out.println(e.getMessage());
		}

	}

}
