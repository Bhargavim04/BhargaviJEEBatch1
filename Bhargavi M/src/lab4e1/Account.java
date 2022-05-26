package lab4e1;

public class Account {

	long accNum;
	double balance;
	Person person;

	// No arg constructor
	public Account() {
	}

	public Account(long accNum, double balance, Person person) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.person = person;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		// peron1 details
		Person person1 = new Person("Smith", 25.0f);
		Account acc1 = new Account(1001, 2000.00, person1);
		System.out.println("Account Number: " + acc1.accNum);
		System.out.println("Balance: " + acc1.balance);
		System.out.println(acc1.person);
		System.out.println();

		Person person2 = new Person("Kathy", 27.0f);
		Account acc2 = new SavingsAcc();
		acc2.accNum = 1002;
		acc2.balance = 3000.00;
		acc2.person = person2;
		System.out.println("Account Number: " + acc2.accNum);
		System.out.println("Balance: " + acc2.balance);
		System.out.println(acc2.person);
		System.out.println();

		// deposit 2000 to acc1
		acc1.deposit(2000.00);
		System.out.println(acc1.getBalance());

		// withdraw 2000 from acc2
		acc2.withdraw(2000.00);
		System.out.println(acc2.getBalance());
		System.out.println();

		Person person3 = new Person("Ram", 30.0f);
		Account acc3 = new CurrentAcc();
		acc3.accNum = 1003;
		acc3.person = person3;
		System.out.println("Account Number: " + acc3.accNum);
		System.out.println(acc3.person);
		System.out.println();

		acc3.deposit(2000.00);
		System.out.println(acc3.getBalance());
		acc3.withdraw(200000.00);
		System.out.println(acc3.getBalance());

	}

}
