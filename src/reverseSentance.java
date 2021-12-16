
public class reverseSentance {

	public static void main(String[] args) {
		String s="I love my India";
		String s1="";
		String [] split=s.split(" ");
		for(int i=split.length-1; i>=0; i--){
			s1+= split[i] + " ";
		}System.out.println(s1);
	}

}
