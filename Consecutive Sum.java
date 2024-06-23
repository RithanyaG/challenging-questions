/*
Write a function to find the sum of all possible consecutive numbers that add up to a given positive 
integer N. The function should return a list of lists, where each sublist represents a consecutive sequence 
of numbers that add up to N.
*/

import java.util.*;
import java.io.*;
public class Main
{
    public static List<List<Integer>> sum(int n){
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int total=0;
            List<Integer> res=new ArrayList<>();
            for(int j=i;i<=n;j++){
                total+=j;
                res.add(j);
                
                if(total==n)
                   { result.add(new ArrayList<>(res));
                    break;}
                else{
                    if(total>n)
                        break;
                }
            }
        }
        return result;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		System.out.println(sum(n));
	}
}
