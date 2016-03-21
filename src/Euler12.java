
public class Euler12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisors=0;
		for(int i=0; divisors<500; i++){
			int triangleNum=calculateTriangleNumber(i);
			if(triangleNum%2==0 && triangleNum%3==0){
				divisors=countDivisors(triangleNum);
				System.out.println("the "+i+"th"+" triangle number is "+triangleNum+" and has "+divisors+" divisors");
			}
			

		}
	}
	
	public static int calculateTriangleNumber(int num){
		int triangleNum = 0;
		for(int i=0; i<=num; i++){
			triangleNum=triangleNum+i;
			
		}
		return triangleNum;
	}
	
	public static int countDivisors(int num){
		int divisors=1;
		for(int i=1; i<=num/2; i++){
			if(num%i==0){
				divisors=divisors+1;
			}
		}
		return divisors;
	}

}
