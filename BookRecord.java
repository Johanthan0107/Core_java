record Mobile(String brand, String Colour, float cost){
	Mobile(){
	this("Apple","Black",50000f);}
		public static void main(String[] args){
			Mobile m=new Mobile("Apple","Black",50000f);
		    Mobile m1=new Mobile ("Vivvo","Blue",20000f);
			Mobile m2=new Mobile ("Samsung","White",30000f);
			Mobile m3=new Mobile("Oppo","Pink",250000f);
	
			System.out.println(m);//Mobile[brand=Apple, Colour=Black, cost=50000.0]
			System.out.println(m1);//Mobile[brand=Vivvo, Colour=Blue, cost=20000.0]
			System.out.println(m2);//Mobile[brand=Samsung, Colour=White, cost=30000.0]
			System.out.println(m3);//Mobile[brand=Oppo, Colour=Pink, cost=250000.0]

		}
	}
