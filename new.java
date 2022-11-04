public class Person {
 static int eyes=2;
 static int ears=2;
 static int legs=2;
 static int hands=2;
	String name;
	double hight;
	double weight;
	String foodHabbits;
	Person(String name, double hight, double weight, String foodHabbits) { 
		this.name=name;
		this.hight=hight;
this.weight=weight;
		this.foodHabbits=foodHabbits;
	}
	static void sleep() {
		System.out.println("will sleep 365 days");
	}
	void eat() {
		System.out.println("will eat 365 days");
	}
// methods to change properties after object creation
	void setName(String name){
		this.name=name;
	}
	String getName() {
		return name;
	}
	void setHight(double hight){
		this.hight=hight;
	}
	double getHeight() {
		return hight;
}
	void setWeight(double weight) {
		this.weight=weight;
	}
	double getWeight() {
		return weight;
	}
	void setFoodHabbits(String foodHabbits) {
		this.foodHabbits=foodHabbits;
	}
	String getFoodHabbits() {
		return foodHabbits;
	}
	void print() {
		System.out.println("Eyes :"+eyes);
		System.out.println("Ears :"+ears);
		System.out.println("Hands :"+hands);
		System.out.println("Legs :"+legs);
		
		System.out.println("Name  :"+name);
		System.out.println("Hight :"+hight);

System.out.println("Weight :"+weight);
		System.out.println("Food Habbits:"+foodHabbits);
	}
	
	public static void main(String raj[]){
		Person p=new Person("Johnathan",5.4,58,"Non-Veg");
		p.print();
		Person p1=new Person("Riya",5.1,60,"Veg");
		p1.print();
	}
 } // save with Person.java
/*public static void main(String args[]){
		Person p=new Person("Srilekha",162.5,50.28,"Non-Veg");
		p.print();
		Person p1=new Person("Krishna",153.65,46.28,"Veg");
		p1.print();*///don't put hear,if you have to put this method ,will use another package.
	
