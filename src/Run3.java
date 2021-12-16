abstract class C{
	void test1(){
		System.out.println("Test1 in C");
	}
	 
}
class D extends C{
	 void test1(){
		System.out.println("Test1 in D");
	}
}
class E extends D{
	void test1(){
		System.out.println("Test1 in E");
	}
}

public class Run3 {

	public static void main(String[] args) {
		E e1=new E();
		D d1=e1;
		C c1=e1;
		e1.test1();
		d1.test1();
		c1.test1();
		
		
		
		
	}

}
