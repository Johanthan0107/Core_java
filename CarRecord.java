record Car(int Carinches, String Name, float Prize, String Type){
Car(){
	this(100,"BMW",6000000f,"Benz");
}
public static void main(String[] args){
	Car c=new Car(100,"BMW",6000000f,"Benz");
	Car c1=new Car(70,"Jaguar",5000000f,"Sports");
        Car C2=new Car( 80,"Odi",7000000f,"Benz");
	System.out.println(c);
	System.out.println(c1);
        System.out.println(C2);
}
}
