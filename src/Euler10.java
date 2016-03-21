
public class Euler10 {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
		 * 
		 * Find the sum of all the primes below two million.
		 */

		/*long primeSum = 2l;
		
		for (long i = 3l; i < 2000000; i=i+2) {
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
		System.out.println(primeSum);*/
		
		long primeSum=2l;
		for(long i=3l; i<2000000; i+=2){
			if(isPrime(i)){
				primeSum=primeSum+i;
			}
		}
		System.out.println(primeSum);
	}


	private static boolean isPrime(long num) {
		// TODO Auto-generated method stub
		for(long j=3; j<=Math.sqrt(num); j+=2){
			if(num%j==0){
				return false;
			}
		}
		return true;
	}
}

	


