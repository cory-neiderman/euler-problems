import java.lang.Math;

public class Euler30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumOfNums = 0;
		 int max = (int)Math.pow(9.0, 5.0)*5;
		for(int i=10; i<max; i++){
			int powerSum=powerSumCalc(i);
			if(powerSum==i){
				sumOfNums=sumOfNums+i;
				
			}
		}
		System.out.println(sumOfNums);
	}

	private static int powerSumCalc(int number) {
		int sum=0;
		String numberString = String.valueOf(number);
		for(int i=0; i<numberString.length(); i++){
			double digit = (double)Character.getNumericValue(numberString.charAt(i));
			sum=sum+(int)Math.pow(digit,5); 
		}
		
		
		return sum;
	}

}
