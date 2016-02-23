import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class euler5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
		//list prime factors of all numbers of the set
		//multiply the largest prime factors together to get the least common multiple
		//  so 2, 8, 12, 17 is 2^1=2, 2^3=8, 2^2*3^1=12, 17^1=17.  so lcm is 2^3*3^1*17^1=408
		//for 20 it would be 2,3,2^2,5,2*3,7,2^3,3^3,2*5,11,2^2*3,13,2^2*7, 5*3,2^4,17,3^2*2, 19, 5*2^2
		//2^4,3^2,5,7,11,13,17,19
		

		/*List<Integer> primeList = new ArrayList<>();
		for(int j=2; j<=20; j++){
			boolean isPrime=true;

			for(int i=2; i<=Math.sqrt(j); i++){
				if(j%i==0){
					isPrime=false;
					i=j;
				}
			}					
			if(isPrime){
				primeList.add(j);
			}
		}*/
		
		
		
		
		
	
	}
}

/*import javax.swing.JOptionPane;
public class P5
{
    public static final int MAX = 20;
    public static Integer temp = 1;
    public static void main(String[] args)
    {
        int smalldiv = 0, temp = 0,total =0;
        String stat = "ok";
        
        smalldiv = temp;
        for(temp =1; stat=="ok"; temp++)
        {
            for(int c=1;c<=MAX ;c++)
            {
                if(check(temp,c)){
                    total++;
                }
            }
            
            if(total == MAX)
            {     
                stat = "ko";            
                smalldiv = temp;
            }
            total=0;
        }
        JOptionPane.showMessageDialog(null,"The smallest div is: " + smalldiv);
    }
    public static boolean check(int t,int a)
    {
        if(t%a == 0)
        {    
            return true; 
        }
        else
        {    
            return false; 
        }
    }
}*/


