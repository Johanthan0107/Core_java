record Pen(String Brand, String Colour, float Prize){
	Pen(){
	this("Cello","Black",20f);}
		public static void main(String[] args){
			Pen p=new Pen("Cello","Black",20f);
		    Pen p1=new Pen("Saino","Blue",25f);
			Pen p2=new Pen("Meow","red",20f);
			System.out.println(p);//Pen[Brand=Cello, Colour=Black, Prize=20.0]
			System.out.println(p1);//Pen[Brand=Saino, Colour=Blue, Prize=25.0]
			System.out.println(p2);//Pen[Brand=Meow, Colour=red, Prize=20.0]
		}
	}
