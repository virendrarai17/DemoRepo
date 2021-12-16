public class NumWithoutLoop {

	// created a method of int args and if n > 0, subtract 1
	static void printNum(int n){
		if(n > 0){
			printNum(n - 1);
			System.out.println(n + " ");
	}}
	public static void main(String[] args) {
		printNum(100);
	}

}
