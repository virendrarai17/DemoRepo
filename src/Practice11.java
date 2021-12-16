
public class Practice11 {
	static int [] a={0,0,1,2,0,2,1,1};
	 static int min;
	 static int j =0;
	// static int no =0;
 public static void main(String[] args) {
	for(int i=0; i<a.length; i++){
		if(a[i]==0){
			a[j++]=a[i];
		}
	}
	while(j<a.length){
		a[j++]=1;
	}
	for(int z=0; z<a.length;z++){
		//System.out.print(" ");
		System.out.print(" "+a[z]);
	}
 } }