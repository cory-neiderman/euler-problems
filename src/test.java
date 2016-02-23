
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 59569;
		boolean isPrime = true;
		for(int i=3; i<=Math.sqrt(num); i=i+2){
			if(num%i==0)
				isPrime= false;
		}
		if(isPrime)
			System.out.println(num+" is Prime!");
		else
			System.out.println(num+" is not prime!");
	}

}
/*for (long i = 3l; i <= Math.sqrt(num); i++) { // find factors of num
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
}*/