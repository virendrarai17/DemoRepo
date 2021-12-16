
public class compareString {

	public static void main(String[] args) {
		String s1="Hell";
		String s2="Hello";
		
		if(s1.compareTo(s2)>0){
			System.out.println("S1 string is greater");
		}else if(s1.compareTo(s2)<0){
			System.out.println("S2 string is greater");
		}else{
			System.out.println("both are equal");
		}

	}

}
