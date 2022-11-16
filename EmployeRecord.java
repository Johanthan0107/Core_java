record Employe(int EmId, String Name, String EmDept, float salary){
	
	Employe(){
	this(1,"A","IT",10000f);
	}
	public static void main(String[] args){
		
		Employe e=new Employe(1,"A","IT",10000f);
		
		Employe e1=new Employe(2,"B","IT",20000f);
		
		Employe e2=new Employe(3,"C","IT",30000f);
		System.out.println(e);//Employe[EmId=1, Name=A, EmDept=IT, salary=10000.0]
        System.out.println(e1);//Employe[EmId=2, Name=B, EmDept=IT, salary=30000.0]
        System.out.println(e2);//Employe[EmId=3, Name=C, EmDept=IT, salary=30000.0]
	}
	}
