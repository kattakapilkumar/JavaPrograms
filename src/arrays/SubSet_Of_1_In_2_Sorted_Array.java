package arrays;


import java.util.Arrays;
import java.util.Scanner;
public class SubSet_Of_1_In_2_Sorted_Array {
	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);	
		int nar1 = sc.nextInt();
		int ar1[]=new int[nar1];
		int nar2 = sc.nextInt();
		int ar2[] = new int[nar2];		
		for(int i=0;i<nar1;i++)
		{
			ar1[i] = sc.nextInt();					
		}
		for(int j=0;j<nar2;j++)
		{
			ar2[j] = sc.nextInt();
		}		
		int foundcount =0;
		Arrays.sort(ar1);
		Arrays.sort(ar2);		
	    for(int k=0;k<nar1;k++)
	    {
	    	lb2: for(int x=0;x<nar2;x++)
	    	{	    			    		    		
	    		if(ar2[x]==ar1[k])
		    	{
		    		break lb2;
		    	}
	    		else
	    		{
	    			if(ar1[k] > ar2[x])
	    			{
	    				
	    			}
	    			else
	    			{
	    				 
	    				System.out.println(ar1[k]);
	    			}    				    			
	    		}
	    	}
	    	
	    }		
	}

}
