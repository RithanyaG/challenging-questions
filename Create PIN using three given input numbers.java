/*
-The PIN should be made up of 4 digits
- The unit (ones) position of the PIN should be the least of the units position of the three input numbers
- The tens position of the PIN should be the least of the tens position of the three input numbers
- The hundreds position of the PIN should be the least of the hundreds position of the three input 
numbers
- The thousands position of the PIN should be the maximum of all the digits in the three input numbers
*/
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		int i3=sc.nextInt();
		
		int one1=i1%10;
		int one2=i2%10;
		int one3=i3%10;
		
		int tens1=(i1/10)%10;
		int tens2=(i2/10)%10;
		int tens3=(i3/10)%10;
		
		int hun1=(i1/100)%10;
		int hun2=(i2/100)%10;
		int hun3=(i3/100)%10;
		
		int ones=Math.min(Math.min(one1,one2),one3);
		int tens=Math.min(Math.min(tens1,tens2),tens3);
		int huns=Math.min(Math.min(hun1,hun2),hun3);
		
		int max1=Math.max(Math.max(one1,one2),one3);
		int max2=Math.max(Math.max(tens1,tens2),tens3);
		int max3=Math.max(Math.max(hun1,hun2),hun3);
		
		int thsd=Math.max(Math.max(max1,max2),max3);
		
		String key=""+thsd+huns+tens+ones;
		System.out.println(key);
		}
}
