
public class GivenCharacterCount {
 
	public static void main(String[] args) {
		String s1="developerrrrr";
		int count=0;
		for(int i=0; i<=s1.length()-1;i++){
			if(s1.charAt(i)=='r'){
				count++;
				}
		}System.out.println(count);
	}

}
