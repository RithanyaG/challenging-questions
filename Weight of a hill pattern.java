import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a;
		int n=sc.nextInt();//first row
		int incr=sc.nextInt();
		int levels=sc.nextInt();
		int weight=n;
		for(int i=2;i<=levels;i++){
		    a=n+incr;
		    n=a;
		    weight+=i*a;
		}
		System.out.println(weight);
		}
}
