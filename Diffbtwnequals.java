//Difference between == and equals()
class String_Test {
public static void main(String args[]) {
	String s1="y";
	String s2="z";
	String s3="z";
	System.out.println(s1==s2);// false
//System.out.println(s1.equals(s2));//false
	System.out.println(s3==s2);//true 
		System.out.println();
	String s4=new String("y");
	String s5=new String("z");
	String s6=new String("z");
  String s7=new String("y");	System.out.println(s5==s4);//false
	System.out.println(s4==s6);//false
	System.out.println(s5.equals(s6));//true
System.out.println(s4.equals(s7));//True
System.out.println(s1.equals(s2));//false
}
}