public class roughWork{
	public static void main(String[] args) {
	int a[]= {1,2,4,3,15,86};
	int big=0;
	for (int i : a) {
		if(big<i){
			big=i;
		}
	}System.out.println(big);
	}
}