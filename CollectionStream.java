//StreamDemo.java
import java.util.*;
import java.util.stream.Collectors;
public class StreamDemo {
public static void main(String args[]){
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(20);
al.add(35);
al.add(15);
al.add(40);
al.add(5);
System.out.println(al);
//filter the even numbers
List<Integer> l=al.stream().filter(n->n%2==1).collect(Collectors.toList());
System.out.println(l);
 }
}
