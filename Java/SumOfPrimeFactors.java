
import java.util.Scanner;

public class SumOfPrimeFactors {
	public static int sumPrime(int a){

		int count = 0;
		int sum = 0;
		int nextNumber = 0;
		int divisor = 2;

		for(count = 2; count <= a; count++){

			if(a % divisor == 0){
				nextNumber = a / divisor;
				a = nextNumber; 
				sum += divisor;
					if(a == 1){
						break;
					}
			}
			if(a % divisor != 0){
				divisor++;
			}
		}

		return sum;
	}


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Get the sum of the prime factors");
		System.out.print("Enter number: ");
		int userNumber = input.nextInt();

		int sumOfPrime = sumPrime(userNumber);

		System.out.println();
		System.out.println("The sum of the prime factors is: " + sumOfPrime);
	}
}