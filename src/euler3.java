import java.lang.Math;

public class euler3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The prime factors of 13195 are 5, 7, 13 and 29.
		 * 
		 * What is the largest prime factor of the number 600851475143 ?
		 */

		long factor = 0l;
		boolean isPrime = true;
		long num = 600851475143l;
		long largestPrimeFactor = 0l;

		for (long i = 3l; i <= Math.sqrt(num); i++) { // find factors of num
			if (num % i == 0) {
				factor = i;
				// System.out.println(factor);
				for (int j = 2; j <=factor/2; j++) {
					if (factor % j == 0) // check if factor is prime
						isPrime = false;
				}
			}
			if (isPrime) {
				largestPrimeFactor = factor;

			}
		}
		System.out.println(largestPrimeFactor);

	}
}