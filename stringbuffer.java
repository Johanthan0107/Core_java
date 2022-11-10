//StringBffer program
public class Test {
	public static void main(String[] args) {
		String s="Joshua";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(sb.insert(2, "R"));//added
		System.out.println(sb.capacity());
		System.out.println(sb.toString());//display repeated
	}
}