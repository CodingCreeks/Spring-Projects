import javax.swing.JOptionPane;

public class AmushmentEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int adults;
		int childrens;
		int total;
		
		adults=Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Number of Adults"));
		childrens=Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Number of Childrens"));
		total=(11 * adults)+(6*childrens);
		System.out.println("Your Total Entrance Fee is :"+total +"$");
	}

}
