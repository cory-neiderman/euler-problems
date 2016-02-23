
public class Euler10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
		 * 
		 * Find the sum of all the primes below two million.
		 */

		long primeSum = 0l;
		
		for (long i = 2l; i < 2000000; i++) {
			boolean isPrime = true;
			for (long j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				
				System.out.println(i);
				primeSum = primeSum + i;
				
			}
			
		}
		System.out.println(primeSum);

	}

}
