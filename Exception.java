class Exception {
public static void main(String[] arg) {
var x=75;/*Warning\Error

Main.java:3: error: cannot find symbol
var x=75;
^
  symbol:   class var
  location: class*/
  	
var s="Hello";/*error: cannot find symbol
var s="Hello";
^
  symbol:   class var
  location: class Exception*/
System.out.println(" "+x+" "+s);
 }//Var is a keyword, used for ducting content of the datatype
}