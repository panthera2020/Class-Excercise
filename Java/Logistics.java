import java.util.Scanner;

public class Logistics {

	public static int pay(int delivery){
		int payment = 0;

		if(delivery >= 70) payment = delivery * 500 + 5000;
		if(60 >= delivery && delivery < 70) payment = delivery * 250 + 5000;
		if(50 >= delivery && delivery < 60) payment = delivery * 200 + 5000;
		if(delivery < 50) payment = delivery * 160 + 5000;

	return payment;
	}

	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount of delivery: ");
		int delivery_input = input.nextInt();

		System.out.println("Your Payment is: " + pay(delivery_input));
	}
}