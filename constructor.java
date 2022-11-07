//differentaite the contructors
class Sample{
	Sample() {
	System.out.println("default constructor"); 	}
	
	Sample(int a) {
	System.out.println("Parameterized_Contructor integer"); }
	
	Sample(String s) {
	System.out.println("Parameterized_Contructor string"); }
	
public static void main(String[] args) {
	Sample s1=new Sample();
	Sample s2=new Sample(50);
	Sample s3=new Sample("welcome"); }
}