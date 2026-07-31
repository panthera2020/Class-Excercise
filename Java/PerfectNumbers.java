import java.util.Scanner;

public class PerfectNumbers {
	public static boolean perfectNum(int a){
		int count = 0;
		int sum = 0;
		boolean perfectNumber = true;

		for(count = 1; count <= a/2; count++){
			if(a % count == 0){
				sum += count;
			}
		}

		if(sum == a){
			perfectNumber = true;
		}else{
			perfectNumber = false;
		}

	return perfectNumber;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Check if the number is a perfect Number");
		System.out.print("Enter number: ");
		int userNumber = input.nextInt();

		boolean isOrNotPerfectNumber = perfectNum(userNumber);

		System.out.println();
		System.out.println("Is " + userNumber + " a perfect Number? ");
		System.out.println();
		System.out.println(isOrNotPerfectNumber);
	}
}