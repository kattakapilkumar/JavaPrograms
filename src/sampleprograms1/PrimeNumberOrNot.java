package sampleprograms1;


import java.util.*;
public class PrimeNumberOrNot 
{
     public static void main(String[] args)
     {
    	 Scanner sc=new Scanner(System.in);
    	 
    	 int n=sc.nextInt();
    	 int count =0;
    	 for(int i=2;i<n;i++)
    		 
    	 {
    		 if(n%i == 0)
    		 {
    			 count++;
    			 break;
    		 }
    	 }
    	 if(count == 0)
    	 {
    		 System.out.println("n is  a prime number");
    	 }
    	 else
    	 {
    		 System.out.println("n is NOT a prime Number");
    	 }
    	 
     }
	
	
	   
}
