/*package demoOn16August2016;

import java.util.Scanner;

class AccountDetails{
	private static Scanner s;
	public static void main(String[] args) {
		Accounts ac1=new Accounts(100, "Anil");
		System.out.println("Enter the amount to withdrawn (>$50 & < $2000) :");
		try {
				s = new Scanner(System.in);
				int amount=s.nextInt();
				ac1.withDraw(amount);
				ac1.print();
		} catch (InsufficientFundException e) {
			e.exceptionmessage1();
		} catch (lowBalance e) {
		e.exceptionmessage2();
		//e.exceptionmessage2();
	} catch (WithDrawlimit e) {
			e.exceptionmessage();
		}
	}
}
*/