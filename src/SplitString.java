public class SplitString {
// Split(), split the string and return string array
	public static void main(String[] args) {
	String s1="   Ms dhoni is a great indian wicket   keeper   ";
	String[] s2=s1.trim().replaceAll("\\s+", " ").split(" ");
	for(String s:s2){
		System.out.println(s);
	}
	System.out.println(s2[6]);
	
	String str="17/07/1990";
	String[] str1=str.split("/");
    System.out.println(str1[1]);
	}
	
	
}
