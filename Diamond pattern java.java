
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int space=n-1,i,j,k;
		for(i=0;i<n;i++){
		    for(j=0;j<space;j++)
		        System.out.print(" ");
		    for(k=0;k<=i;k++)
		        System.out.print("* ");
		    System.out.print("\n");
		    space--;
		}
		space=0;
		for(i=n;i>0;i--){
		    for(j=0;j<space;j++)
		        System.out.print(" ");
		    for(k=0;k<i;k++)
		        System.out.print("* ");
		    System.out.print("\n");
		    space++;
		}
	}
}
