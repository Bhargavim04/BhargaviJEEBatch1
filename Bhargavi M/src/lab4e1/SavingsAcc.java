package lab4e1;

public class SavingsAcc extends Account{

	final double minBalance=500.00;
	public void withdraw(double amount) {
		
		 double newBalance = balance - amount;
	   
		if(newBalance<minBalance)
		{
			 System.out.println("Cant withdraw amount ");
		}
		else
		{
			System.out.println("In Savings Account");
			balance = newBalance;
		}
		
	}
}
