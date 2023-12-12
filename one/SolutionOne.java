import java.util.ArrayList;
import java.util.List;

public class SolutionOne {

	public static List<String> printFriendFoe() {
		int friendMod = 4, foeMod = 7, size = 100;
		String friendStr = "Friend", foeStr = "Foe";
		List<String> res = new ArrayList<>();
		for(int i=1;i<=size;i++) {
			String bffr = "";
			if(i%friendMod == 0 && i%foeMod == 0) {
				bffr = friendStr+foeStr;
			} else if(i%friendMod == 0) {
				bffr = friendStr;
			} else if(i%foeMod == 0) {
				bffr = foeStr;
			} else {
				bffr = Integer.valueOf(i).toString();
			}
			res.add(i%10==0?bffr+System.lineSeparator():bffr+", ");
		}
		return res;
	}

	public static void main(String[] args) {
		String res = String.join("",printFriendFoe());
		System.out.println(res);
	}
}
