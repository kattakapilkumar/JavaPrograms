package strings;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Sub_Array_Of_String {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		int nsas = 0;
		int strlen = str1.length();
		
		/*
		  
		 FORMULA  :::     (n*n+1)  / 2 ;
		  
		 */
		
		
		
		if(strlen %2 == 0)
		{
			nsas = strlen * 2;
		}
		else
		{
			nsas = (nsas *2) -  (nsas/2);
		}
		
		String words[] = new String[nsas];
		
		int startindex = 0;
		int endindex = 0;
				
		ArrayList al = new ArrayList();
	/*	for(endindex=1; endindex<strlen; endindex++)
		{
			al.add(str1.substring(startindex, endindex));
			startindex++;			
		}
		startindex =0;
		for(endindex=1; endindex<strlen; endindex = endindex+2 )
		{
			al.add(str1.substring(startindex, endindex));
			startindex++;			
		}
		
	*/
		
		
		for(int i=0;i<strlen;i++)    // i ===  ending index 
		{
			for(int x=0;i<strlen;x++)  //  x  === starting index 
			{				
				al.add(str1.substring(x,i));											
				//for (int k=i; k<=j; k++)
                    //System.out.print(substring[k]+"");
			}
		}	
	}	
}
/*
 GEEKS FOR GEEKS LOGIC  
 for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                // Print subarray between current starting
                // and ending points
                for (int k=i; k<=j; k++)
                    System.out.print(arr[k]+"");       //**   for strings   temp+=s[k];  String cancatination  
            }
        }
 
 **/
