record Car(int Carinches, String Name, float Prize, String Type){
TV(){
	this(100,"BMW",6000000f,"Benz");
}
public static void main(String[] args){
	TV t=new TV(100,"BMW",6000000f,"Benz");
	TV t1=new TV(70,"Jaguar",5000000f,"Sports");
	System.out.println(t);
	System.out.println(t1);
}
}