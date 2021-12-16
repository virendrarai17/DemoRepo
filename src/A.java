import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		int n=1;
	do{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		if (a>b){
			System.out.println(a+ " is greater");
		}
		else if (b>a){
			System.out.println(b+ " is greater");
		}
		else{
			System.out.println("Both are equals");}
		
		System.out.println("Do you want to continue if yes press 1");
		n=scn.nextInt();
		}while(n==1);
		
	}}
