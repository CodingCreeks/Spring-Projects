/*package demoOn16August2016;

class Accounts  {
	
	int accNo;
	String aName;
	float aBalance=4500;
	float iRate=3.5f;

Accounts(int accNo, String aName) {
		this.accNo = accNo;
		this.aName = aName;
}

void withDraw(int amount) throws InsufficientFundException, WithDrawlimit, lowBalance {
	if(amount<2000 && !((aBalance-amount)>500)){
		InsufficientFundException isf=new InsufficientFundException();
		throw isf;
		}else if(amount<50 || amount>2000){
			WithDrawlimit wdl=new WithDrawlimit();
			throw wdl;
		} else if(!((aBalance-amount)>500)){
			lowBalance lb=new lowBalance();
			throw lb;
		}
		else
			aBalance=aBalance-amount;
}

void print(){
	System.out.println("Account Holder Name :" +aName);
	System.out.println("Account Number :"+accNo);
	System.out.println("Account Balance :"+aBalance);
	System.out.println("Interest Rate :" +iRate);
	System.out.println("**********************************");
}
}
*/