import java.util.Scanner;


public class primeNumber {

	public static void main(String[] args) {
		int x=1;
		do{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scn.nextInt();
		int count=0;
		if(n==0||n==1){
			System.out.println("Number is not prime");
			continue;
		}
		for(int i=2; i<=n-1; i++){
			if(n%i==0){
				count++;
				break;
			}
		}
		if(count==1){
			System.out.println("not prime");
		}
		else{
			System.out.println("Prime number");
		}
	System.out.println("Press 1 to continue");
		x=scn.nextInt();}
		while(x==1);
	}}


