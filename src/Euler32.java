import java.util.ArrayList;
import java.util.List;

public class Euler32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		List<String> prodList = new ArrayList<>();
		for(int i=0; i<10000; i++){
			for(int j=0; j<10000; j++){
				int prod=j*i;
				String prodString = String.valueOf(prod);
				String iString = String.valueOf(i);
				String jString = String.valueOf(j);
				boolean bool=false;
				if(prodString.length()+jString.length()+iString.length()==9)	
					bool =panDigitalTest(prodString, iString, jString);
				if(bool && !prodList.contains(prodString)){
					prodList.add(prodString);
					System.out.println(prodString);
					
				}
			}
		}
		for(int i=0; i<prodList.size(); i++){
			sum=sum+Integer.parseInt(prodList.get(i));
		}
		System.out.println(sum);
		
	}

	private static boolean panDigitalTest(String num, String i, String j) {
		
		List<Character> myList= new ArrayList<>();
		String fullString = num+i+j;
		
		for(int k=0; k<fullString.length(); k++){
			myList.add(fullString.charAt(k));
		}
		
		if(myList.contains('1') && myList.contains('2')&&myList.contains('3')&&myList.contains('4')&&myList.contains('5')&&
				myList.contains('6')&&myList.contains('7')&&myList.contains('8')&&myList.contains('9')){
			return true;
		}
		
		return false;
	}

}
