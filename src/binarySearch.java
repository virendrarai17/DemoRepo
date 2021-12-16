import java.util.Arrays;


public class binarySearch {

	public static void main(String[] args) {
		// Binary search using Arrays.binarysearch(int a[], int key) method

		int a[]={25, 5, 6, 10, 2, 4};
		Arrays.sort(a);
		for(int i: a){
		System.out.println(i);	
		}
		System.out.println("serach the element");
	    int search=2;
	  int ser=  Arrays.binarySearch(a, search);
	
	    System.out.println("index of search value"+ ser);
	}

}
