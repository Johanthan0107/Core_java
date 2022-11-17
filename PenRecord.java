record Pen(String Brand, String Colour, float Prize){
	Pen(){
	this("Glory","Green",50f);}
		public static void main(String[] args){
			Pen p=new Pen("Glory","Green",50f);
		    Pen p1=new Pen("Faith","Blue",30f);
			Pen p2=new Pen("Believe","red",20f);
			System.out.println(p);//Pen[Brand=Glory, Colour=Green, Prize=50.0]
			System.out.println(p1);//Pen[Brand=Faith, Colour=Blue, Prize=30.0]
			System.out.println(p2);//Pen[Brand=Believe, Colour=red, Prize=20.0]
		}
	}
