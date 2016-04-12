import java.util.ArrayList;
import java.util.List;

public class Euler35 {

	public static void main(String[] args) {
		List<Integer> primeList=new ArrayList<>();
		primeList.add(2);
		//find all primes below 1m so largest number is 999,999
		for(int i=3; i<100; i=i+2){
			if(isPrime(i))
				primeList.add(i);
		}
		int circularPrimeCount=0;
		
		for(int i=0; i<primeList.size(); i++){
			if(isCircularPrime(primeList.get(i), primeList)){
				circularPrimeCount=circularPrimeCount+1;
				System.out.println(primeList.get(i));
			}
		}
		System.out.println(circularPrimeCount);
	}

	private static boolean isCircularPrime(int num, List<Integer> primeList) {
		
		if(num<10)
			return true;
		
		String numString = String.valueOf(num);
		List<String> permutedList = permute("",numString);
		for(int i=0; i<permutedList.size(); i++){
			if(!primeList.contains(permutedList.get(i))){
				return false;
			}
		}
		return true;
	}

	

	private static List<String> permute(String perm, String  numString) {
		
		List<String> perms = new ArrayList<>();
		if(numString.isEmpty()){
			perms.add(perm);
		}
        for (int i = 0; i < numString.length(); i++) { 
        	permute(perm + numString.charAt(i), numString.substring(0, i) + numString.substring(i + 1, numString.length())); 
        }

        return perms;
	}

	private static boolean isPrime(int num) {
		
		for(int i=3; i<=Math.sqrt(num); i=i+2){
			if(num%i==0)
				return false;
		}
		
		return true;
	}

}
