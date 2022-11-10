// String methods usage
class String_Test {
public static void main(String args[]) {
	String s1="Johnathan Foundation";
	String s2="johnathan";
		System.out.println(s1.equals(s2));//False
		System.out.println(s1.equalsIgnoreCase(s2));//False
		System.out.println(s1.indexOf("N"));//-1
		System.out.println(s1.indexOf("a"));//4
		
		System.out.println(s1.substring(3));//nathan Foundation
		System.out.println(s1.substring(2,4));//hn
	
		System.out.println(s1+" BK");//Johnathan Foundation BK
		System.out.println(s1.concat(s2));//adding/Johnathan/Foundationjohnathan
	System.out.println(s1.contains("nath"));//true
	System.out.println(s1.startsWith("J"));//true
	System.out.println(s1.endsWith("a"));//false
	System.out.println(s1.toUpperCase());//JOHNATHAN FOUNDATION
	System.out.println(s1.toLowerCase());//johnathan foundation

//System.out.print(s1.repeat(3)+ " ");
	System.out.println(s2.replace('j','Y'));//Yohnathan
	}
}