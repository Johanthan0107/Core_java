//Generics:- it is used for compiler time safety.

import java.util.*; 
class GenericsTest{ 
public static void main(String args[]){ 
	
ArrayList<String> list=new ArrayList<String>(); 
list.add("Kanna"); //index:-0 
list.add("Innu"); //index:-1
list.add("John");
list.add("Innu"); //index:-2
//list.add(1);//compile time error 
String s=list.get(1);//type casting is not required 
System.out.println("Element names is: "+s);

Iterator<String> itr=list.iterator(); 

while(itr.hasNext()){ 
System.out.println(itr.next());
  }
 }
}
