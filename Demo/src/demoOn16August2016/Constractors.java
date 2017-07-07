/*package demoOn16August2016;

public class Constractors {

	public static void main(String[] args) {
		ConOverloading_1 obj1=new ConOverloading_1();
		ConOverloading_1 obj2=new ConOverloading_1(5);
		
		ConOverloading_1 obj3=new ConOverloading_2();
		obj3.methodOverridding(5, 6.0f);

	}

}

class ConOverloading_1{
	ConOverloading_1(){
		System.out.println("DC in ConOverloading_1");
	}
	
	ConOverloading_1(int i){
		System.out.println("SPC in ConOverloading_1");
	}
	
	void methodOverridding(int i, float f){
		System.out.println("TPC with 2 diff.. Parameter in ConOverloading_1");
	}
}

class ConOverloading_2 extends ConOverloading_1{
	ConOverloading_2(){
		System.out.println("DC in ConOverloading_2");
	}
	
	ConOverloading_2(int i){
		System.out.println("SPC in ConOverloading_2");
	}
	
	void methodOverridding(int i, float f){
		
		System.out.println("TPC with 2 diff.. Parameter in ConOverloading_2");
	}
}*/