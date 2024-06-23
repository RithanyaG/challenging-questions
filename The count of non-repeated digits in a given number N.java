import java.util.*;
import java.io.*;

public class Main{
	public static int unique(int N){
		int count=0;
		int cnt[]={0,0,0,0,0,0,0,0,0,0};
		while(N>0){
		int rem=N%10;
		cnt[rem]++;
		N=N/10;
		}
		for(int i=0;i<cnt.length;i++){
		if(cnt[i]==1){
			count++;
			}
		}
		return count;
		}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(unique(N));
		}
}
