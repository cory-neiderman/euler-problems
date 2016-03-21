
import java.util.List;
import java.util.LinkedList;

public class Euler14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LinkedList<Long> chain = new LinkedList<>();	//ArrayList did not work for some reason
		int longestChain=0;								//LinkedList<Integer> did not work either
		for(int i=2; i<1000000; i++){
			long num=i;
			chain.add(num);
			while(num!=1){
				if(num%2==0){
					num=num/2;
					chain.add(num);
				}
				else{
					num=3*num+1;
					chain.add(num);
				}
			}
			
			if(chain.size()>longestChain){
				longestChain=chain.size();
				System.out.println("the "+i+"th"+" collanz is "+chain.size()+" long");
			}
			chain.clear();
		
		}
		//just counting a loop and not using a list did not work either.  program stopped at like 123k
		
	}

}
