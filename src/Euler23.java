import java.util.ArrayList;
import java.util.List;

public class Euler23 {

	public static void main(String[] args) {
		
		List<Integer> abundantNums=new ArrayList<>();
		List<Integer> allNums=new ArrayList<>();
		
		for(int i=0; i<28124; i++){
			allNums.add(i);
		}
		int abundantSumLimit = 28123;
		for(int i=12; i<28123-12; i++){
			int divisorSum = findDivisorSum(i);
			if(divisorSum>i){
				abundantNums.add(i);
			}
		}
		for(int i=0; i<abundantNums.size(); i++){
			for(int j=0; j<abundantNums.size(); j++){
				int abundantSum=abundantNums.get(i)+abundantNums.get(j);
				if(abundantSum<allNums.size())
					allNums.set(abundantSum, 0);
			}
		}
		int sum=0;
		for(int i=0; i<allNums.size(); i++){
			sum=sum+allNums.get(i);
		}
		System.out.println(sum);
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
