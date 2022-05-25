public class FibonacciSeries{

	public static void main(String[] args) {
		int firstNum = 0, secondNum = 1;
		System.out.print(firstNum + " " + secondNum);
		int count = 10;
		for (int elementPosition = 2; elementPosition < count; ++elementPosition) {
			int sumOfTwoNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sumOfTwoNum;
			System.out.print(" " + sumOfTwoNum);
			elementPosition++;
		}

	}

}
