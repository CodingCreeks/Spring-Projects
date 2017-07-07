package demoOn11August_2016_Part3_Cons;

public class constructors {
	
	public static void main(String [] args){
		
		cons2 obj=new cons2();
		obj.display();
		
	}
}


class cons1{
	int i;

	public cons1() {
		
		System.out.println("In Default Cons 1.");
	}

	public cons1(int i) {
				
		System.out.println("In single Parameter Cons 1.");
	}
	
}
	class cons2 extends cons1{
		

		public cons2() {
			//super(3);
			System.out.println("In Default Cons 2.");
		}

		public cons2(int i, int j) {
			
			System.out.println("In two Parameter's Cons 2.");
		}
		
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("In Display:");
		}
	}
