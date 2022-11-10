//import java.util.Arrays;
public class Test {
	public static void main(String[] raj){
	String[] sa= {"Mango","Bananna","Graphs","Apple","Pineapple"};
	for(String i:sa) 
		System.out.print(i+" ");
	System.out.println();
	System.out.println("After Sorting");
	Arrays.sort(sa);
	System.out.println(Arrays.toString(sa));
	}
}
