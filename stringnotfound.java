//current string not found it gives -1
class Sample {
	static void printStringCharcters(String s) {
		for(int i=0;i<s.length();i++)
			System.out.print("\t"+s.charAt(i));
		System.out.println();
	}
	public static void main(String args[]) {
		String str="Johnathan";
		printStringCharcters(str);
		System.out.println(str.indexOf("h"));//2
		System.out.println(str.lastIndexOf("t"));//5
		System.out.println(str.indexOf("r"));//-1
		}
}
