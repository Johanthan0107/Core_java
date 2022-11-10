class Person {
 static int eyes=2;
 static int ears=2;
 static int legs=2;
 static int hands=2;
	String name;
	double height;
	double weight;
	String foodHabbits;
	Person(String name, double height, double weight, String foodHabbits) { 
		this.name=name;
		this.height=height;
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
	void setHeight(double height){
		this.height=height;
	}
	double getHeight() {
		return height;
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
		System.out.println("Height :"+height);
		System.out.println("Weight :"+weight);
		System.out.println("Food Habbits:"+foodHabbits);
	}
 } // save with Person.java