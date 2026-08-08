import java.util.Scanner;

public class AccountTest {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		Account myAccount = new Account("Jane Doe", 0.0);
		// Account myBalance = new Account(0.0);

		System.out.println("The Intial Account name: " + myAccount.getName());
		System.out.println("The Intial Balance: " + myAccount.getBalance());

		System.out.println();
		System.out.println("Enter account account Name: ");
		String name = input.nextLine();

		System.out.println("Enter Deposit Amount: ");
		double balance = input.nextDouble();

		myAccount.deposit(balance);

		myAccount.setName(name);

		System.out.println();
		System.out.println("The New Account Name: " + myAccount.getName());
		System.out.println("The New Balance: " + myAccount.getBalance());

		System.out.println();
		System.out.println("Enter amount to withdraw: ");
		double amount = input.nextDouble();

		myAccount.withdraw(amount);

		System.out.println();
		System.out.println("Account Namw: " + myAccount.getName());
		System.out.println("Balance: " + myAccount.getBalance());
	}
}