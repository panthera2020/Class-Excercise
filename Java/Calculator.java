import java.util.Scanner;

public class Calculator {
	public static double multiply(double firstNumber, double secondNumber){
		return firstNumber * secondNumber;
	}

	public static double add(double firstNumber, double secondNumber){
		return firstNumber + secondNumber;
	}

	public static double minus(double firstNumber, double secondNumber){
		double minusNumbers = 0;

		if(secondNumber > firstNumber){
			minusNumbers = secondNumber - firstNumber;
		}else{
			minusNumbers = firstNumber - secondNumber;
		}

		return minusNumbers;
	}

	public static double divide(double firstNumber, double secondNumber){
		double division = 0;

		if(secondNumber == 0){
			division = 0;
		}else{
			division = firstNumber / secondNumber;
		}

		return division;
	}

	public static double calculator(double firstNumber, double secondNumber, char operator){
		double answer = 0;

			switch (operator) {
		    case '*':
		        answer = multiply(firstNumber, secondNumber);
		        break;
		    case '+': 
		        answer = add(firstNumber, secondNumber);
		        break;
		    case '/': 
		        answer = divide(firstNumber, secondNumber);
		        break;
		    case '-': 
		        answer = minus(firstNumber, secondNumber);
		        break;
		    default: 
		        answer = 0;
			}

		return answer;
	}

	public static void main(String... args){

		//System.out.println(calculator(3,5,'/'));

		Scanner input = new Scanner(System.in);

		System.out.println("Do your calculation");
		System.out.println();

		System.out.println("Enter first Number: ");
		double userFirstNumber = input.nextDouble();

		System.out.println();

		System.out.println("Enter second Number: ");
		double userSecondNumber = input.nextDouble();

		System.out.println();
		input.nextLine();

		System.out.println("Enter operator character(*,+,/,-): ");
		char userOperatorCharcter = input.nextLine().trim().charAt(0);

		System.out.println();
		System.out.println(userFirstNumber + " " + userOperatorCharcter + " " + userSecondNumber + " = " + calculator(userFirstNumber, userSecondNumber, userOperatorCharcter));
	}
}