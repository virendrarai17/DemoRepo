import java.util.Scanner;

//Pallindrome
public class Pallindrome {

	public static void main(String[] args) {
		int a=1;
		do{
		System.out.println("type an String");
		Scanner scn=new Scanner(System.in);
		String s1=scn.next();
		String s2="";
		for(int i=s1.length()-1; i>=0; i--){
			s2+=s1.charAt(i);
		}
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("String is Pallindrome");
			}
		else{
			System.out.println("String is not pallindrome");}
			System.out.println("If yo want to continue press 1");
			a=scn.nextInt();
		}while(a==1);
		
	}

	}
