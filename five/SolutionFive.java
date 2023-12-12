import java.io.BufferedReader;
import java.io.FileReader;

public class SolutionFive {

	public static String perfectNumber(Integer number) {
		int helper = 0;
		String notPerfect = " not perfect";
		String perfect = " perfect";
		String almostPerfect = " almost perfect";
		if(number%2!=0) return number.toString()+notPerfect;
		for(int i=1;i<=number/2;i++){
			if(number%i==0) helper+=i;
		}
		if(number==helper) return number.toString()+perfect;
		if(number>=helper-2) return number.toString()+almostPerfect;
		return number.toString()+notPerfect;
	}

	public static void main(String[] args) throws Exception {
		String path = args[0];
		
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line = ""; 
			while(line != null) {
				line = reader.readLine();
				if(line != null) System.out.println(perfectNumber(Integer.valueOf(line)));
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
}
