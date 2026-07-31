public class MethodOne {
	public static void main(String[] args){

		printTimesTable(5);
		System.out.println();
		String welcome = printWelcomeMessage();
		int number = doubleIt(5);
		int average = average(4, 6, 12);
		boolean range = isRange(5, 1, 20);
		boolean numberOne = isNegative(-5);

		System.out.println(welcome);
		System.out.println(number);
		System.out.println(average);
		System.out.println(numberOne);
		System.out.println(range);
		//System.out.print(multiple);
	}

	public static String printWelcomeMessage(){
		return "Welcome to Java";
		//1
	}

	public static int doubleIt(int n){
		int multiplyByTwo = n * 2;
		return multiplyByTwo;
		//2
	}

	public static boolean isNegative(int n){ 
		if(n < 0){
			return true;
		}else{
			return false; 
		}
		//3
	}

	public static void printTimesTable(int n){
		int answer = 0; 
		for(int count = 1; count <= n; count++){
				System.out.print(n * count + " ");
			}
	}

	public static int average(int a, int b, int c){
		int average = (a + b + c) / 3;
		return average;
		//5
	}

	public static boolean isRange(int n, int low, int high){
		if(n > low && n < high){
			return true;
		}else{
			return false;
		}
		//6
	}

}