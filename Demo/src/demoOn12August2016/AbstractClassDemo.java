package demoOn12August2016;

public class AbstractClassDemo {

	public static void main(String[] args) {
		
// Conventional way of programming
		
		Human h1=new Teacher();
		Human h2=new Doctor();
		Human h3=new Engineer();
		System.out.println("Conventional way of programming");
		h1.getName();
		h1.getProfession();
		
		h2.getName();
		h2.getProfession();
		
		h3.getName();
		h3.getProfession();
	
	
// Normal 'for' loop
			Human h[]=new Human[3];
		
		h[0]= new Teacher();
		h[1]= new Doctor();
		h[2]= new Engineer();
		System.out.println("\nNormal 'for' loop");
		for(int i = 0; i<h.length;i++){
			
			h[i].getName();
			h[i].getProfession();
		}
		
// Enhanced 'for' loop
		
		Human h11[]=new Human[3];
		
		h11[0]= new Teacher();
		h11[1]= new Doctor();
		h11[2]= new Engineer();
		System.out.println("\nEnhanced 'for' loop");
		for(Human x:h11){
		
			x.getName();
			x.getProfession();
		}

	}

}

abstract class Human {
	abstract void getName();
	abstract void getProfession();
}

class Teacher extends Human {

	void getName() { System.out.print("Anish :"); }
	void getProfession() { System.out.println(" He is a Teacher"); }
}

class Doctor extends Human {

	void getName() { System.out.print("Karthik :"); }
	void getProfession() { System.out.println(" He is a Doctor"); }
}

class Engineer extends Human {

	void getName() { System.out.print("Mukesh :"); }
	void getProfession() { System.out.println(" He is an Engineer"); }
}

