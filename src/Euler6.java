
public class Euler6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The sum of the squares of the first ten natural numbers is,

		12 + 22 + ... + 102 = 385
		The square of the sum of the first ten natural numbers is,

		(1 + 2 + ... + 10)2 = 552 = 3025
		Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

		Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
		int sumOfSquares=0;
		int sum = 0;
		for(int i=1; i<=100; i++){
			sumOfSquares=sumOfSquares+i*i;
		}
		System.out.println(sumOfSquares);
		for(int i=1;  i<=100; i++){
			sum=sum+i;
		}
		System.out.println(sum);
		int sumsSquared = sum*sum;
		System.out.println(sumsSquared-sumOfSquares);
	}

}
