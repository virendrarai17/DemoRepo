class mainClass {
	static class nestedClass {
		void nestedMethod() {
			System.out.println("nested");
		}}
	public static void main() {
		nestedClass ns = new nestedClass();//creating object for nested class
		ns.nestedMethod();
		System.out.println("main  method");
	}}
public class OuterClass {// this is main class
	public static void main(String[] args) {
		mainClass.main();
	}
}
