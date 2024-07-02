import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //give your own input and try
		int[] A = {13, 2, 4, 15, 12, 10, 5};
		List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : A) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }
        oddNumbers.sort(Collections.reverseOrder());
        evenNumbers.sort(Integer::compareTo);
        
        int index = 0;
        for (int odd : oddNumbers) {
            A[index++] = odd;
        }
        for (int even : evenNumbers) {
            A[index++] = even;
        }
        
        System.out.println(Arrays.toString(A));
	}
}
