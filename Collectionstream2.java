import java.util.*;
import java.util.stream.Collectors;
public class StreamDemo1 {
	
public static void main(String args[]){
	
ArrayList<Integer> marks=new ArrayList<Integer>();

marks.add(60);
marks.add(34);
marks.add(25);
marks.add(70);
marks.add(40);
marks.add(22);
System.out.println(marks);
//filter the pass marks

List<Integer> Failmark=marks.stream().filter(m->m<=35).collect(Collectors.toList());
System.out.println(Failmark);  }
}