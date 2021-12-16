//Repetative character not allowed second time.

public class DuplicateCharNotAllowInString {

	public static void main(String[] args) {
		String s1="Developer";
		String s2="";
		for(int i=0; i<=s1.length()-1; i++){
			if(s2.indexOf(s1.charAt(i))==-1){
				s2+=s1.charAt(i);
			}
		}System.out.println(s2);

	}}
