import javax.swing.JOptionPane;

public class IsEvenNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= Integer.parseInt(JOptionPane.showInputDialog("Please enter the Number to check Even or not"));
		boolean b=isEvenNumber(n);
		if(b)
			System.out.println("Entered Number is Even");
		else
			System.out.println("Entered Number is not Even");
	}

	public static boolean isEvenNumber(int n) {
		if(n%2==0)
			return true;
		return false;
	}

}
