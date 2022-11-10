class StringDemo {
	public static boolean isPalindrom(String s) {
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String rev=sb.toString();
		if(s.equals(rev)) {		System.out.println("Palindrom");
				return true;
		}else {			System.out.println("Not");
		return false; }
	}
public static void main(String args[]) {
		isPalindrom("Hello");
		isPalindrom("joshua");
		isPalindrom("Believer");
	}//O/P:-not not not
}
