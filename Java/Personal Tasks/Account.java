public class Account {
	private String name;
	private double balance;

	// Account Name
	public Account(String name, double balance){
		this.name = name;

		if(balance > 0){
			this.balance = balance;
		}
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	// Deposit
	public void deposit(double depositAmount){
		if(depositAmount > 0){
			this.balance += depositAmount;
		}
	}

	public double getBalance(){
		return balance;
	}

	// Withdraw
	public void withdraw(double withdrawalAmount){
		if(withdrawalAmount  <= balance){
			this.balance -= withdrawalAmount;
		}
	}

}