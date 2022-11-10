// find out the string: read a file in that file_data find out "Joju" is available or not ?

/*file name : Example .txt
file path: C:/Users/pedar/OneDrive/Desktop/ANP-C3042/Example.txt*/

//import java.io.*;

class FindString{
	static void stringFinder(String s) {
		
		try {
		FileReader fr=new FileReader("C:/Users/pedar/OneDrive/Desktop/ANP-C3042/Example.txt");
		
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		
		if(line.indexOf("Joju")!=-1) {
			System.out.println("Joju is availble");
		}else

 { System.out.println("Joju Not availble"); }
 
		}catch (IOException e) {
		e.printStackTrace(); }
	}
public static void main(String args[]) {
	stringFinder("Joju");	
 }
}
