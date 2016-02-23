import sun.security.util.Length;

public class euler4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/
		int multiple=0;
		String largestPalindrome="";
		int largestPal=0;
		for(int i=100; i<=999; i++){															//parse thru all 3 digit numbers
			for(int j=100; j<=999; j++){
				multiple=i*j;																		  //multiple all 3 digit numbers
				String multipleString = Integer.toString(multiple);      //convert to string
				String reverseString = "";
				
				for(int k=multipleString.length()-1; k>=0; k--){				//create palindrome
					reverseString=reverseString+multipleString.charAt(k);
				}
				if(multipleString.equals(reverseString)){
					if(Integer.parseInt(reverseString)>largestPal){
						largestPal=Integer.parseInt(reverseString);
					System.out.println(largestPal+" "+i+" "+j);}

				}
					
			}
		}
	
				
				/*for(int k=0; k<multipleString.length()/2; k++){
					if( multipleString.charAt(k) != multipleString.charAt(multipleString.length()-1-k) )
						System.out.println("not palindrome");
					else
						System.out.println(multipleString);*/
								
				
					
					
					
				
		
		/*String newString="kajfd";
		String reverseString="";
		for(int i=newString.length()-1; i>=0;i--){
			reverseString=reverseString+newString.charAt(i);
		}
		if(newString.equals(reverseString))
			System.out.println(newString+" is palindrome!");
		else
			System.out.println(newString+" is not a palindrome!");*/

	}
}
	


