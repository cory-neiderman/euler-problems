import java.math.BigInteger;

public class Euler20 {

	public static void main(String[] args) {
		
		
		int num=100;
		BigInteger mult= BigInteger.valueOf(1);
		for(int i=num; i>0; i--){
			BigInteger bigI=BigInteger.valueOf(i);
			mult=mult.multiply(bigI);
		}
		int sum=0;
		String multString=String.valueOf(mult);
		for(int i=0; i<multString.length(); i++){
			int digit=Character.getNumericValue(multString.charAt(i));
			sum=sum+digit;
			
		}
		System.out.println(sum);
	}

}
