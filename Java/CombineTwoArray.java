import java.util.Scanner;

public class CombineTwoArray {
	public static int[] combineTwoArray(int[] firstArray, int[] secondArray){
		int[] combineArray = new int[firstArray.length + secondArray.length];

		int length = firstArray.length + secondArray.length;

		for(int count = 0; count < firstArray.length; count++){
			combineArray[count] = firstArray[count];
		}

		int remainingLength = length - firstArray.length;
		int counter = 0;

		for(int count = remainingLength + 1; count < combineArray.length; count++){
			combineArray[count] = secondArray[counter];

			if(counter > secondArray.length -1){
				break;
			}

			counter++;
		}

		return combineArray;
	}

	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input two sets of numbers and combine both");
		System.out.println();



		

		System.out.print("How many numbers is the first set of number: ");
		int numberOfFirstSet = input.nextInt();

		int[] firstSetArray = new int[numberOfFirstSet];

		System.out.println();

		System.out.print("How many numbers is the second set of number: ");
		int numberOfSecondSet = input.nextInt();

		int[] secondSetArray = new int[numberOfSecondSet];

		System.out.println();
		System.out.println("Enter first set of number: ");
		for(int count = 0; count < numberOfFirstSet; count++){
			firstSetArray[count] = input.nextInt();
		}

		System.out.println();
		System.out.println("Enter first set of number: ");
		for(int count = 0; count < numberOfSecondSet; count++){
			secondSetArray[count] = input.nextInt();
		}

		System.out.println();

		// int[] arrayOne = {3,1,5,7};
		// int[] arrayTwo = {0,8,2};

		// int[] combineBothArray = combineTwoArray(arrayOne,arrayTwo);

		int[] combineBothArray = combineTwoArray(firstSetArray,secondSetArray);

		for(int count = 0; count < combineBothArray.length; count++){
			System.out.print(combineBothArray[count] + " ");
		}

		System.out.println();
	}
}