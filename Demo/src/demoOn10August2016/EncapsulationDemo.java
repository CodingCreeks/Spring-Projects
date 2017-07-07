package demoOn10August2016;
public class EncapsulationDemo{
    public static void main(String args[]){
    	EncappulationDemo_declaration obj = new EncappulationDemo_declaration();
   
    	
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setSsn(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getSsn());
         System.out.println("Employee Age: " + obj.getEmpAge());
         
    } 
}



