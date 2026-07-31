// Arrange numbers in descending order

import java.util.Scanner;

public class DescendingNumbers{
	public static int[] descend(int[] numbers){

		int temp = 0;

		for(int count = 0; count < numbers.length; count++){
			for(int counter = 0; counter < numbers.length; counter++){
				if(numbers[counter] < numbers[count]){
					temp = numbers[count];
					numbers[count] = numbers[counter];
					numbers[counter] = temp;
				}
			}
		}

		return numbers;
	}





	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Get your numbers in descending Number");
		System.out.println("How many numbers do you want to enter?");
		int numberOfInput = input.nextInt();

		int[] numbers = new int[numberOfInput];

		System.out.println();
		System.out.println("Enter the numbers: ");
		for(int count = 0; count < numberOfInput; count++){
			numbers[count] = input.nextInt();
		}

		System.out.println();

		int[] arrayInOrder = descend(numbers);

		for(int count = 0; count < numberOfInput; count++){
			System.out.print(arrayInOrder[count] + " ");
		}
	}
}