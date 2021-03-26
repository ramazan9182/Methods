
public class MyMath {

	// defining method
	static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	static int max(int a, int b) {
		int result;

		if (a > b) {
			result = a;
		} else {
			result = b;
		}

		return result;
	}

	public static int gcd(int number1, int number2) {
		int gcd = 1;
		for (int i = 2; ((i <= number1) && (i <= number2)); i++) {
			if (((number1 % i) == 0) && ((number2 % i) == 0)) {
				gcd = i;
			}
		}
		return gcd;
	}

}
