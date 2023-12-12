public class SolutionSix {
	public static boolean monkeyTrouble(boolean a, boolean b) {
		if(a == b) return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(monkeyTrouble(true,true));
		System.out.println(monkeyTrouble(false,false));
		System.out.println(monkeyTrouble(true,false));
	}	
}
