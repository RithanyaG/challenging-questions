import java.util.*;
public class Main{
	public static void main(String args[]){
		int rows=5;
		printpyramid(rows);
	}
	public static void printpyramid(int rows){
		int i,j;
		for(i=1;i<=rows;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
