public class Method{
	public static void main(String[] args){
		int sumResult = add(10, 5);
		int substractResult = substract(12, 7);
		int minusResult = minus(10, 5);
		int divideResult = divide(12, 4);

		System.out.println(sumResult);
		System.out.println(substractResult);
		System.out.println(minusResult);
		System.out.println(divideResult);
	}

		public static int add(int a, int b){
			int sum = a + b;
			return sum;
		}

		public static int substract(int a, int b){
			int sub = a - b;
			return sub;
		}

		public static int minus(int a, int b){
			int minus = a - b;
			return minus;
		}

		public static int divide(int a, int b){
			int div = a / b;
			return div;
		}
}