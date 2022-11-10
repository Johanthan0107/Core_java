//split method
class StringDemo {
public static void main(String args[]) {
	String s="My name is Joshua";
	//String[]sa={"my","name","is","Joshua"};//each word/string
String[] sa=s.split("");// it split each character
for(String i:sa)
		System.out.print(i+"  ");
	}
}