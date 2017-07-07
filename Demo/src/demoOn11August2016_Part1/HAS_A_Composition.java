package demoOn11August2016_Part1;



public class HAS_A_Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student(100, "Anish", "Ashford Street","Atlanta", "GA","USA",30030);
		student.print();
		
		System.out.println("******************");
		
		Employee employee=new Employee(200, "Ram", "Ashford Street","Florida", "FL","USA",60030);
		employee.print();

	}

}
