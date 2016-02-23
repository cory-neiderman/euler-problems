
public class Euler7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubList<String> groceryList = new ArrayList<String>( );
		//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
		//What is the 10 001st prime number?
	    
		int primeCount=2;
		int nthPrime=10001;
		for(int j=3; primeCount<nthPrime; j=j+2){		//only need to count odds so start at 3 and add 2
			boolean isPrime=true;
			for(int i=2; i<=Math.sqrt(j); i++){					//no reason to try numbers above 1/3
				if(j%i==0){
					isPrime=false;
				}
		
			}
			if(isPrime){
				System.out.println(j+" is prime. ");
				primeCount=primeCount+1;
				
			}
			//else
				//System.out.println(j+" is not prime");
		}
		
	
	}
}