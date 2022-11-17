record Chocolate(String Name,String Type,float Prize){
	Chocolate(){
		this("Bournville","Cadbury",150f);
	}
	public static void main(String[] args){
		Chocolate c=new Chocolate("Bournville","Cadbury",150f);
		Chocolate c1=new Chocolate("DairyMilk","Bubble",120f);
		Chocolate c2=new Chocolate("Twilight Tryst","Cadbury",220f);
		
		System.out.println(c);//Chocolate[Name=Bournville, Type=Cadbury, Prize=150.0]
		System.out.println(c1);//Chocolate[Name=Dairy Milk, Type=Bubble, Prize=120.0]
		System.out.println(c2);//Chocolate[Name=Twilight Tryst, Type=Cadbury, Prize=220.0]

	}
}