import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int amount=2456;
		int[] notes=new int[]{2000,500,200,100,50,20,10,5,1};
		int[] notecount=new int[9];
		
		for(int i=0;i<9;i++){
		    if(amount>=notes[i]){
		        notecount[i]=amount/notes[i];
		        amount=amount%notes[i];
		    }
		}
		for(int j=0;j<9;j++){
		    if(notecount[j]!=0){
		        System.out.println(notes[j]+":"+notecount[j]);
		    }
		}
	}
}
