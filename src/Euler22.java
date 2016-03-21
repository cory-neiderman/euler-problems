import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Euler22 {

	public static void main(String[] args) {
		
		String filePath = "/Users/coryneiderman/Downloads/p022_names.txt";
		
		try(FileReader reader = new FileReader(filePath)) {
			BufferedReader lineReader = new BufferedReader(reader);
			String line = lineReader.readLine();
			String names = "";
			while(line != null){
				names=names+line;
				line = lineReader.readLine();
			}
			String[] namesArray=names.trim().replace("\"", "").split(",");
			Arrays.sort(namesArray);
			int total=0;
			int count=1;
			int sum=0;
			int wordValue=0;
			for(int i=0; i<namesArray.length; i++){
				System.out.print(namesArray[i]);
				String aName=namesArray[i];
				sum=0;
				wordValue=0;
				for(int j=0; j<aName.length(); j++){
					sum=sum+Character.getNumericValue(aName.charAt(j))-9;
					System.out.print(" "+sum+" ");
					wordValue=sum*count;
				}
				
				total=total+wordValue;
				System.out.println(total);
				count=count+1;
			}
			System.out.println(total);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not find the file "+filePath);
		}catch (IOException e){
			System.out.println("An error while reading file");
			
	
	}
	}
}