public class Test {
	public static String m1(String s) {
		StringBuffer sb=new StringBuffer(s);
		sb.insert(4, "R");
		System.out.print(sb.toString());
		return sb.toString(); }
	public static void main(String[] args) {
		m1("Johnathan");		
	}
}