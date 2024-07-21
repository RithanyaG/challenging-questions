*****
*   *
*   *
*   *
*   *
*****
import java.util.*;
public class Main{
	int rows=5,columns=5,i,j;
	for(i=1;i<=rows;i++){
		for(j=1;j<=columns;j++){
			if(i==1 ||  i==rows || j==1 || j==columns){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
