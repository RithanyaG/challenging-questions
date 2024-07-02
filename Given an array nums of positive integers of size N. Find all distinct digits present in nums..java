import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr={131,23,34};
		Set<Character> digits=new HashSet<>();
		for (int num : arr) {
            String numStr = Integer.toString(num);
            for (char digit : numStr.toCharArray()) {
                digits.add(digit);
            }
        }
		for (char digit : digits) {
            System.out.print(digit + " ");
        }
	}
}
