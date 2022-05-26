package lab4e1;

public class CurrentAcc extends Account {

	double overDraftLimit = 100000.00;
	
	public void deposit(double amount) {
		balance += amount+overDraftLimit;
	}

	public void withdraw(double amount) {

		double newBalance = balance - amount;

		if (newBalance < overDraftLimit) {
			System.out.println("Cant withdraw amount ");
		} else {
			System.out.println("In Current Account");
			balance = newBalance;
		}

	}

}
