import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Euler29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BigInteger> expList = new ArrayList<>();
		
		for(int i = 2; i<101; i++){
			for(int j=2; j<101; j++){
				BigInteger a = BigInteger.valueOf(i);
				BigInteger b = BigInteger.valueOf(j);
				BigInteger exp = a.pow(j);
				if(notDuplicate(exp, expList))
					expList.add(exp);
			}
		}
		
		System.out.println(expList.size());

	}

	private static boolean notDuplicate(BigInteger exp, List<BigInteger> expList) {
		boolean bool=true;
		for(int i=0; i<expList.size(); i++){
			if(expList.contains(exp)){
				return false;
			}
			else
				return true;
		}
		return true;
		
	}
	

}
