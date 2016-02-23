import java.lang.Math;


public class Euler9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

	a2 + b2 = c2
	For example, 32 + 42 = 9 + 16 = 25 = 52.

	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.
	c=sqrt(a2+b2)
	c=1000-a-b
	*/
	int a,b,c;
	for(a=1; a<1000; a++){
		for(b=1; a+b<1000; b++ ){
			c=1000-a-b;
			if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
				int product = a*b*c;
				
				System.out.println(product);
			}
		}
		
	}	
		
	}

}
