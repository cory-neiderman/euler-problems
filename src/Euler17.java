
public class Euler17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<1001; i++){
			String numberInWords = convertToWords(i);
			int letterCount = numberInWords.length();
			sum=sum+letterCount;
			
		}
		sum=sum-27; //take away 3 for every even 100, ie remove the "and" for 100,200,300...900
		System.out.println(sum);

	}
	
	public static String convertToWords(int num){
		
		String numberInWords = "";
		
		int thousands=num/1000;
		numberInWords = numberInWords+getNumber(thousands, "thousand");
		
		int hundreds = num%1000/100;
		numberInWords = numberInWords+getNumber(hundreds, "hundredand");
		
		int tens = num%1000%100/10;
		if(tens!=1){
			numberInWords=numberInWords+getTens(tens);
			int ones = num%1000%100%10;
			numberInWords=numberInWords+getNumber(ones, "");
		}
		else{
			int ones = num%1000%100%10;
			numberInWords=numberInWords+getTeens(ones);
		}
		
		
		return numberInWords;
	}
	
	public static String getTeens(int number){
		
		String numberWord="";
		switch(number){
			case 0: numberWord="ten";
					break;
			case 1: numberWord="eleven";
					break;
			case 2: numberWord="twelve";
					break;
			case 3: numberWord="thirteen";
					break;
			case 4: numberWord="fourteen";
					break;
			case 5: numberWord="fifteen";
					break;	
			case 6: numberWord="sixteen";
					break;
			case 7: numberWord="seventeen";
					break;
			case 8: numberWord="eighteen";
					break;
			case 9: numberWord="nineteen";
					break;

			
		}
		
		
		return numberWord;
		
	}
	
	public static String getNumber(int number, String amount){
		String numberWord="";
		switch(number){
			case 0: numberWord="";
					break;
			case 1: numberWord="one"+amount;
					break;
			case 2: numberWord="two"+amount;
					break;
			case 3: numberWord="three"+amount;
					break;
			case 4: numberWord="four"+amount;
					break;
			case 5: numberWord="five"+amount;
					break;	
			case 6: numberWord="six"+amount;
					break;
			case 7: numberWord="seven"+amount;
					break;
			case 8: numberWord="eight"+amount;
					break;
			case 9: numberWord="nine"+amount;
					break;

			
		}
		
		
		return numberWord;
	}
	
	public static String getTens(int number){
		
		String numberWord="";
		switch(number){
			case 0: numberWord="";
					break;
			
			case 2: numberWord="twenty";
					break;
			case 3: numberWord="thirty";
					break;
			case 4: numberWord="forty";
					break;
			case 5: numberWord="fifty";
					break;	
			case 6: numberWord="sixty";
					break;
			case 7: numberWord="seventy";
					break;
			case 8: numberWord="eighty";
					break;
			case 9: numberWord="ninety";
					break;

			
		}
		
		
		return numberWord;
		
	}
	
	
	

}
