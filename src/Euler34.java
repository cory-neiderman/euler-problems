
public class Euler34 {

	public static void main(String[] args) {
		int sumOfCuriousNumbers=0;
		long num=999999999999999999l;
		for(int i=10; i<=999999999; i++){
			if(isCurious(i)){
				sumOfCuriousNumbers=sumOfCuriousNumbers+i;
				System.out.println(i);
			}
		}
		
		System.out.println(sumOfCuriousNumbers);
		

	}

	private static boolean isCurious(int number) {
		String numberString = String.valueOf(number);
		int digitFactorialSum=0;
		for(int i=0; i<numberString.length(); i++){
			digitFactorialSum=digitFactorialSum+getFactorial(numberString.charAt(i));
		}
		if(digitFactorialSum==number)
			return true;
		else
			return false;
	}

	private static int getFactorial(char digitChar) {
		
		int digitNum=Character.getNumericValue(digitChar);
		int factorial=1;
		for(int i=1; i<=digitNum; i++){
			factorial=factorial*i;
		}
		return factorial;
	}

}
