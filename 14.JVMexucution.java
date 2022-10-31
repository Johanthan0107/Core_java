public class Test {
	static int a=m1();
	
	static int m1() {
		System.out.println("-> A- execution");
return 20;
}
	static int m2() {
		System.out.println("-> B- execution");
		return 45;
}	
public static void main(String arg[]) {
	System.out.println("-> Main method");
	m3();
}
	static{ 
		System.out.println("-> This is Static block-I");
		m3();
}
	static int b=m2();
	static{ 
		System.out.println("-> This is Static block-II"); 
}
	static void m3(){
		 System.out.println("-> Method-2");
 }
	static void m4() { 
		System.out.println("-> Method-3");
	}
}
