import java.util.ArrayList;
import java.util.List;

public class Euler35 {

	public static void main(String[] args) {
		List<Integer> primeList=new ArrayList<>();
		primeList.add(2);
		for(int i=1; i<2000000; i=i+2){
			if(isPrime(i))
				primeList.add(i);
		}
		int circularPrimeCount=0;
		for(int i=0; i<primeList.size(); i++){
			if(isCircularPrime(primeList.get(i), primeList)){
				circularPrimeCount=circularPrimeCount+1;
			}
		}
		System.out.println(circularPrimeCount);
	}

	private static boolean isCircularPrime(int num, List<Integer> primeList) {
		String numString = String.valueOf(num);
		char[] numArray = numString.toCharArray();
		if(num<10)
			return true;
		else if(!primeList.contains(permute(numArray, 0))){
			//create all the permutations
			//check if they are prime
			
				return false;
			
		}
		else
		 return true;
	}

	

	private static boolean isPrime(int num) {
		
		for(int i=3; i<=Math.sqrt(num); i=i+2){
			if(num%i==0)
				return false;
		}
		
		return true;
	}

}
