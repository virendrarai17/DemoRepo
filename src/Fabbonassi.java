
public class Fabbonassi {

	public static void main(String[] args) {
	    int next=1; 
		int curr=1;
		int pre=0;
		for(int i=1; i<15; i++){
			next=curr + pre;
			curr= pre;
			pre= next;
			System.out.print(curr+ " ");
		}

	}

}
