import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) {
		 int a=1;
		 do{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Year");
		int i=scn.nextInt();
		
		if((i%4==0 && i%100!=0) || i%400==0){
			System.out.println("Year is leap year");
		}else{
			System.out.println("Not a leap year");
		}System.out.println("do you want a continue press 1");
           a=scn.nextInt();
	}while(a==1);

}
}