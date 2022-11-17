record TV(int TVInches, String Name, float Prize, String Type){
TV(){
	this(33,"Samsung",20000f,"Smart TV");
}
public static void main(String[] args){
	TV t=new TV(33,"Samsung",20000f,"Smart TV");
	TV t1=new TV(45,"SONY",55000f,"HD and 4K");
	System.out.println(t);//TV[TVInches=33, Name=Samsung, Prize=20000.0, Type=Smart TV]
	System.out.println(t1);//TV[TVInches=45, Name=SONY, Prize=55000.0, Type=HD and 4K]
}
}