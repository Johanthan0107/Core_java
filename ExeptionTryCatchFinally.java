
class Exeption
{
	public static void main (String[] args)
	{
		System.out.println("Program execution will be start");
		
		int x=9;
		int y=1;
		int results=0;
		 
		 //Try:- which one(results=x/y) is throws the exception so,will put the in try block.
		 try{
		 	results=x/y;
		 }
		 //Catch:-when it's (try) throw the exception(which errors) ,catch block will be received
		 catch(ArithmeticException ae) {
		 	System.out.println(ae.toString());//(or)ae.printstacktrace();
	
	/*throws ae;//it's used for throws the exception to java , because for stoping the exception code */
	}
	//Finally:-Exception will be came or not will use the finally keyword.Note:- it's optional.
	finally {
		 System.out.println("it's finally block");
		}
		 	System.out.println("Out put is:"+results);
	}
}
