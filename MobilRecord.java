record MNC_Company(int Companystaf, String CompanyName, String Companyindustry, String Type,
	String location){
	
MNC_Company(){
	this(100000,"IBM","IT industry","Product based company", "India");
}
public static void main(String[] args){
	
	MNC_Company m=new MNC_Company
(100000,"IBM","IT industry","Product based company","India");

	MNC_Company m1=new MNC_Company(104038,"WIPRO","IT industry","Product based company","india");

    MNC_Company m2=new MNC_Company(30000,"Accenture","IT industry","Product based company","Hyderabad");

	MNC_Company m3=new MNC_Company(25000,"Cognigent","IT industry","Product based company","Bangalore");

	MNC_Company m4=new MNC_Company(35000,"TCS","IT industry","Product based company","Gurgaon");

	System.out.println(m);
	System.out.println(m1);
	System.out.println(m2);
	System.out.println(m3);
	System.out.println(m4);
}
}
//(m)=MNC_Company[Companystaf=100000, CompanyName=IBM, Companyindustry=IT industry, Type=Product based company, location=India]
//(m1)=MNC_Company[Companystaf=104038, CompanyName=WIPRO, Companyindustry=IT industry, Type=Product based company, location=india]
//(m2=MNC_Company[Companystaf=30000, CompanyName=Accenture, Companyindustry=IT industry, Type=Product based company, location=Hyderabad]
//(m3)=MNC_Company[Companystaf=25000, CompanyName=Cognigent, Companyindustry=IT industry, Type=Product based company, location=Bangalore]
//(m4)=MNC_Company[Companystaf=35000, CompanyName=TCS, Companyindustry=IT industry, Type=Product based company, location=Gurgaon]