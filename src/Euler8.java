import java.lang.String;

public class Euler8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="73167176531330624919225119674426574742355349194"
				+ "9349698352031277450632623957831801698480186947"
				+ "8851843858615607891129494954595017379583319528"
				+ "5320880551112540698747158523863050715693290963"
				+ "2952274430435576689664895044524452316173185640"
				+ "3098711121722383113622298934233803081353362766"
				+ "142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921"
				+ "901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441"
				+ "57221553975369781797784617406495514929086256932197846862248283972241375657056057490261407972968652414535100"
				+ "4748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664"
				+ "583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455"
				+ "444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698"
				+ "315520005593572972571636269561882670428252483600823257530420752963450";
		long largest=0l;
		long product =1l;
		for(int k=0; k<s.length()-13; k++){
			String testString=s.substring(k, k+13);
			for(int i=0; i<testString.length(); i++){
				product=product*Character.getNumericValue(testString.charAt(i));
			}
			if(product>largest){
				largest=product;
				System.out.println(largest);
				System.out.println(testString);
				product=1;
			}
			else
				product=1;
		}
		
		
		
	}

}
