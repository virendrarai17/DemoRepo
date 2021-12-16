import java.util.Scanner;
 class B {
	 	 public static void main(String[] args) {
		 int k=1;
		 do{
		 System.out.println("Enter Two Number");
		 Scanner scn=new Scanner(System.in);
		 int x=scn.nextInt();
		 int y=scn.nextInt();
		System.out.println("Program Starts");
		System.out.println("Press 1 for addition");
		System.out.println("press 2 for Mltiplications ");
		System.out.println("Press 3 for Substraction");
		int n=scn.nextInt();
		switch(n){
		case 1:System.out.println(add(x,y));
		break;
		case 2:System.out.println(mul(x,y));
		break;
		case 3:System.out.println(sub(x,y));
		break;}
		System.out.println("if you want to continue press 1");
		k=scn.nextInt();
		}
		 while(k==1);
		 }
	 static int add(int x, int y){
		 return x+y;
	 }
	 static int mul(int x, int y){
		 return x*y;
	 }
	 static int sub(int x, int y){
		 return x-y;
	 }
 }
