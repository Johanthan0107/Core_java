//import java.io.*;
class CheckedExceptionDemo {
public static void main(String args[]) throws FileNotFoundException,IOException {
FileInputStream fis=null;
fis=new FileInputStream("D:/JavaProgram/Welcome.txt");
int i;
while((i=fis.read()) != -1) {
System.out.print((char)i+""); }
fis.close();
 }
}
/*Warning\Error

Main.java:3: error: cannot find symbol
public static void main(String args[]) throws FileNotFoundException,IOException {
                                              ^
  symbol:   class FileNotFoundException
  location: class CheckedExceptionDemo
Main.java:3: error: cannot find symbol
public static void main(String args[]) throws FileNotFoundException,IOException {
                                                                    ^
  symbol:   class IOException
  location: class CheckedExceptionDemo
Main.java:4: error: cannot find symbol
FileInputStream fis=null;
^
  symbol:   class FileInputStream
  location: class CheckedExceptionDemo
Main.java:5: error: cannot find symbol
fis=new FileInputStream("D:/JavaProgram/Welcome.txt");
        ^
  symbol:   class FileInputStream
  location: class CheckedExceptionDemo
4 errors*/