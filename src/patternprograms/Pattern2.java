package patternprograms;

import java.util.*;
public class Pattern2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         Scanner k=new Scanner(System.in);
		
         int n= k.nextInt();
         
         for(int i=1;i<=n;i++)
         {
        	 for(int j=1;j<=i;j++)
        	 {
        		 //System.out.println("here j value is  "+j);
        		 System.out.print(i+" ");
        	 }
        	 System.out.println();
         }
        
         k.close();
         
         
         
		
	}

}

/* output
 * 
 * 
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
 * 
 * 
 */



