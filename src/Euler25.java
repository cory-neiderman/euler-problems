import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Euler25 {

	public static void main(String[] args) {

		List<BigInteger> fibList= new ArrayList<>();
		int digit=0;
		BigInteger fib1=BigInteger.valueOf(1);
		BigInteger fib2=BigInteger.valueOf(1);
		BigInteger fibSum=BigInteger.valueOf(0);
		while(digit<1000){
			fibSum=fib2.add(fib1);
			
			digit = String.valueOf(fibSum).length();
			
			fibList.add(fibSum);
			fib1=fib2;
			fib2=fibSum;
			
		}
		System.out.println(fibList.size()+2);  //add 2 bc the first 2 fib number are not included in the list
		
	}

}
