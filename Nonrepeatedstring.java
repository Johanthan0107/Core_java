
//print each charcter in the string and Non repeating 
class PrintEachCharNonRepeatedString {
	static void printStringCharcters(String s) {
		for(int i=0;i<s.length();i++)
			System.out.print("\t"+s.charAt(i));
		System.out.println();
	}
	static void printNonRepeatedCharcters(String s) {
		for(char i :s.toCharArray()){
        if ( s.indexOf(i) == s.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }
	}
	public static void main(String args[]) {
		String str="Joshua";
		printStringCharcters(str);// each character 
		printNonRepeatedCharcters(str);//u
		System.out.println(str.indexOf("u"));//4
		System.out.println(str.charAt(5));//a
		System.out.println(str.lastIndexOf("a"));//7
		}
}
