class StringConstructorDemo { 	
public static void main(String arg[]) { 
	String s1="abc";
	System.out.println(s1);//abc
	
	String s2=" ";
	System.out.println(s2);//empty space
	
	String s3=new String();
	System.out.println(s3);// empty space,
	
	String s4=new String("Hi");
	System.out.println(s4);// hi
	
	String s5=new String(s1);//String copy
	System.out.println(s5);//abc
	
	String s6=s1;//creating another reference variable for 'abc' obj
	System.out.println(s6);
	
	char[] ch={'a','b','c','d','e','f'};
	System.out.println(ch);//abcdef
	
	String s7=new String(ch);
	System.out.println(s7);// abcdef
	
	String s8=new String(ch, 1,3);
	System.out.println(s8);
	
	byte[] b={65,66,97,98};
	System.out.println(b);
	
	String s9=new String(b);
	System.out.println(s9);//ASCII code //ABab
	
	String s10=null;
	System.out.println(s10);
	
	//String s11=new String(null);
	//System.out.println(s11);// C.T. Error

	String s12=new String(s10);
	System.out.println(s12);// JVM throws Null pointer Exception
	}
}