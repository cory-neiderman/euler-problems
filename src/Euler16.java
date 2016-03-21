import java.lang.Math;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class Euler16 {

	public static void main(String[] args) {

		//215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
		//What is the sum of the digits of the number 21000?
		
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		System.out.println(n);
		int sum=0;
		String numString = n.toString();
		for(int i = 0; i<numString.length(); i++){
			int digit=Character.getNumericValue(numString.charAt(i));
			sum=sum+digit;
		}
		
		System.out.println(sum);
	}

}
