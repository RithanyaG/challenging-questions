import java.util.*;
public class Rotate{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr2[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int position=sc.nextInt();
		int j=0;
		for(int i=position;i<size;i++){
			arr2[j++]=arr[i];
		}
		for(int i=0;i<=position-1;i++){
			arr2[j++]=arr[i];
		}
		for(int i=0;i<size;i++){
			System.out.println(arr2[i]);
		}
	} 
}
