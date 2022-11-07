//String pooling
class Sample {
	public static void main(String args[]) {
		String s1="x";
		String s2="y";
		String s3="y";
		System.out.println(s1==s2);// false
		System.out.println(s2==s3);// true
		
		String s4=new String("x");
		String s5=new String("y");
		String s6=new String("y");
		System.out.println(s4==s5);// false
		System.out.println(s5==s6);// false
	}
}