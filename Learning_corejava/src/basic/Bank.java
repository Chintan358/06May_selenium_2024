package basic;

class InsufficientAmountException extends Exception
{
	
}

class BankOpration
{
	double balance;
	
	public void getBalance()
	{
		System.out.println("Current balance is : "+balance);
	}
	
	public void deposite(double amt)
	{
		balance = balance+amt;
	}
	
	public void withdrow(double amt) throws InsufficientAmountException
	{
		if(amt>balance)
		{
			//System.out.println("Insufficeient amount");
			throw new InsufficientAmountException();
		}
		else
		{
			balance = balance-amt;
		}
	}
}

public class Bank {
	public static void main(String[] args) {
		
		BankOpration bo = new BankOpration();
		bo.getBalance(); 
		bo.deposite(5000);
		bo.deposite(4000);
		bo.getBalance();
		
		try {
			bo.withdrow(15000);
		} catch (InsufficientAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bo.getBalance();
	}
}
