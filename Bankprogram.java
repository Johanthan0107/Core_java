public class John_Bank{
int getInterest(){
return 10;}
}
class SBI extends John_Bank{
int getInterest(){
return 20;}
}
class HDFC extends John_Bank{
int getInterest(){
return 30;}
}
class ICICI extends John_Bank{
int getInterest(){
return 40;}
}
class Axis extends John_Bank{
int getInterest(){
return 50;}
}
class HSBC extends John_Bank{
	int getInterest(){
		return 30;}
		}
class City extends John_Bank{
	int getInterest(){
		return 40;}
		}
class Royal extends John_Bank{
	int getInterest(){
		return 50;}
		}
class DBS extends John_Bank{
	int getInterest(){
		return 60;}
		}
class Bank{
public static void main(String [] args){
SBI s=new SBI();
System.out.println("SBI rate of Interest: "+s.getInterest());

		HDFC h=new HDFC();
		System.out.println("HDFC rate of Interest:"+h.getInterest());
		
		ICICI i=new ICICI();
		System.out.println("ICIC rate of Interest:"+i.getInterest());
		
		Axis a=new Axis();
		System.out.println("Axis rate of Interest:"+a.getInterest());
		
		HSBC hs=new HSBC();
		System.out.println("HSBC rate of Interest:"+h.getInterest());
		
		City c=new City();
		System.out.println("City rate of Interest:"+i.getInterest());
		
		Royal r=new Royal();
		System.out.println("Royal rate of Interest:"+a.getInterest());
		
		DBS d=new DBS();
		System.out.println("DBS rate of Interest:"+a.getInterest());
	}
 }
