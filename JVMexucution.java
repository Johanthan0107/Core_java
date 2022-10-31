public class Test {
	static int a=m1();
	
	static int m1() {
		System.out.println("-> A- execution");//1
return 50;
}
	static int m2() {
		System.out.println("-> B- execution");//4
		return 75;
}	
public static void main(String arg[]) {
	System.out.println("-> Main method");//6
	m3();
}
	static{ 
		System.out.println("-> This is Static block-I");//2
		m3();
}
	static int b=m2();
	static{ 
		System.out.println("-> This is Static block-II"); 
}//5
	static void m3(){
		 System.out.println("-> Method-2");
 }//3,7
	static void m4() { 
		System.out.println("-> Method-3");
	}
}