import java.util.Set;
import java.util.UUID;

public class SolutionThree {

	public static String getAlphaNumeric(String input, int start, int end) {
		if(start >= end || start >= input.length() || end >= input.length()) throw new RuntimeException("bad input");
		Set<Character> lowerCase = Set.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
		Set<Character> upperCase = Set.of('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
		Set<Character> numeric = Set.of('0','1','2','3','4','5','6','7','8','9');
		String res = "";
		for(int i=start;i<=end;i++){
			Character c = Character.valueOf(input.charAt(i));
			if(lowerCase.contains(c) || upperCase.contains(c) || numeric.contains(c)) {
				res = res + c;
			}
		}
		return res.toUpperCase();
	}

	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();
		System.out.printf("uuid: %s \t getAlphaNumeric: %s\n",uuid, getAlphaNumeric(uuid, 0, 6));
	}
}
