import java.util.ArrayList;

public class Main {
	
  public static void main(String[] args) {
  	
ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(26);
    numbers.add(01);
    numbers.add(07);
    numbers.add(97);
    numbers.forEach( (n) -> 
    	{System.out.println(n); } );
  }
}
