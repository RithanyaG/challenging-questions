import java.util.*;
import java.io.*;
public class Main{
    public static int fibo(int n){
        int a=0;
        int b=1;
        if(n==1)
            return a;
        for(int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibo(n));
		}
}
