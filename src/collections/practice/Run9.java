package collections.practice;

import java.util.Scanner;
class Multiplication {

		 int i,j,sum=0;
		 void multi()
		   {
		      Scanner in = new Scanner(System.in);
		      System.out.println("Enter the number of rows of first matrix:");
		      int m=in.nextInt();
		      System.out.println("Enter the number of columns of first matrix:");
		      int n=in.nextInt();
		      int[][] mat1 = new int[m+1][n+1];  
		      for(i=1;i < m+1;i++)
		       {
		          for(j=1;j < n+1;j++)
		           {
		             System.out.println("Enter the element of "+ i +" row "+ j +" column:");
		             mat1[i][j] = in.nextInt();
		            }// end of j loop
		         }//  end of i loop
		      System.out.println("Enter the number of rows of second matrix:");
		      int p=in.nextInt();
		      System.out.println("Enter the number of columns of second matrix:");
		      int q=in.nextInt();
		      int[][] mat2 = new int[p+1][q+1];      
		      for(i=1;i < p+1;i++)
		       {
		         for(j=1;j < q+1;j++)
		           {
		             System.out.println("Enter the element of "+ i +" row "+ j +" column:");
		             mat2[i][j] = in.nextInt();
		            }// end of j loop
		         }// end of i loop
		     if(n==q)//comparing coulmns with rows
		      {
		       int[][] resltmat = new int[m+1][q+1];
		       for ( i = 1 ; i < m+1 ; i++ )
		        {
		         for ( j = 1 ; j < n+1 ; j++ )
		          {  
		            for (int k = 0 ; k < p+1 ; k++)
		               sum = sum + mat1[i][k]*mat2[k][j];
		            resltmat[i][j] = sum;
		            sum = 0;
		          } // end of the loop
		        } // end of the loop
		       System.out.println("Resultant matrix is:\n");
		       for(i=1;i < m+1;i++)
		        {
		           for(j=1;j< q+1;j++)
		            {
		              System.out.print(resltmat[i][j] + "  ");
		             } // end of j loop
		          System.out.println("\n");
		        } // end of i loop
		     }
		    else
		         System.out.println("Matrix Multiplication can't be performed because columns not equal to rows");
		   }//end of function
		}// end of class
		public class Run9
		{
		   public static void main(String arg[])
		     {
		       Scanner in = new Scanner(System.in);
		       Multiplication ob = new Multiplication();
		       ob.multi();
		     }
		} 