package lab4e1;

public class Account {

	long accNum;
	double balance;
	Person person;
	//No arg constructor
	public Account() {}
	
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
		//peron1 details
		Person person1 = new Person("Smith", 25.0f);
		Account acc1 = new Account(1001, 2000.00, person1);
		System.out.println("Account Number: "+acc1.accNum);
		System.out.println("Balance: "+acc1.balance);
		System.out.println(acc1.person);
		System.out.println();

		Person person2 = new Person("Kathy", 27.0f);
		Account acc2 = new SavingsAcc();
		acc2.accNum=1002;
		acc2.balance=3000.00;
		acc2.person=person2;
		System.out.println("Account Number: "+acc2.accNum);
		System.out.println("Balance: "+acc2.balance);
		System.out.println(acc2.person);
		System.out.println();
		
		acc1.deposit(2000.00);
		System.out.println(acc1.getBalance());
		acc2.withdraw(2000.00);
		System.out.println(acc2.getBalance());
		

	}

}
