package collections.practice;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;



public class practice {

	public static void main(String[] args) {
	int a=1;
	int n=12;
	for(int i=2; i<=n-1; i++){
       if(n%i==0){
    	   a=0;
    	   break;
       }}
       if(a==1){
    	   System.out.println("Is prime");
       }else{
    	   System.out.println("Not prime");
       }
		
	}
}