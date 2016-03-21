
public class Euler21 {

	public static void main(String[] args) {

		int num = 10001;
		int amicableSum=0;
		for(int i=2; i<num; i++){
			int divisorSum=findDivisorSum(i);
			int divisorSumOfdivisorSum=findDivisorSum(divisorSum);
			if(divisorSumOfdivisorSum==i && i!=divisorSum){
				amicableSum=amicableSum+i;
			}
		}
		
		System.out.println(amicableSum);
		
	}
	public static int findDivisorSum(int number){
		int sum=0;
		for(int i=1; i<number; i++){
			if(number%i==0){
				sum=sum+i;
			}
		}
		
		
		return sum;
	}

}
