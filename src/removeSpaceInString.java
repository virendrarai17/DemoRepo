// WAP to remove space bw string sentance
public class removeSpaceInString {
	// replaceAll() is used to remove while space before and in bw of the string
	// "\\s" is representation of space and "\t" is for Tab
	// Trim() is used to remove white space before and after the String
	// StringBuffer is used to append, reverse, replace, concatenate and manipulate Strings or sequence of characters
	public static void main(String[] args) {
		String s1= "   India has a 		largest  democracy in the   world   ";
		String s2=s1.replaceAll("\\s+",""); 
		String s3=s1.trim(); 
		System.out.println(s2);
		System.out.println(s3);
		
		// removing white space without using in built method
		char[] s1Array=s1.toCharArray(); // toCharArray() method convert string into character sequence
		StringBuffer STBuffer=new StringBuffer(); 
		for(int i=0; i<s1Array.length; i++){
			if((s1Array[i]!=' ')&&(s1Array[i]!='\t')){
				STBuffer.append(s1Array[i]);
			}
		}System.out.println(STBuffer.toString());
		

	}

}
