import java.util.List;

public class SolutionTwo {
	public static Integer[] firstEnd(Integer[] input) {
		if(input.length == 0) return new Integer[]{};
		return new Integer[]{input[0], input[input.length-1]};
	}
	public static void main(String[] args) {
		System.out.println(List.of(firstEnd(new Integer[]{1,2,3})));
		System.out.println(List.of(firstEnd(new Integer[]{1,2,3,4})));
		System.out.println(List.of(firstEnd(new Integer[]{})));
	}
}
