class Sample2 {
	public static void main(String args[]) {
		String s1=new String("x");
		String s2=new String("y");
		String s3=new String("X");
		String s4=new String("y");
		System.out.println(s1==s3);// false/*we are used assignment operater ==*/
		System.out.println(s1==s4);// false
		System.out.println(s2.equals(s4));//True
		System.out.println(s1.equalsIgnoreCase(s3));// True
	}
}