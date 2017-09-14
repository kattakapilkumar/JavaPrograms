import java.util.*;

public class ToBinary {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int b=0;
		while(n!=0)
		{
			System.out.println("the n value is  "+n);
			System.out.println("***********");
			b=b*10;
			System.out.println("now b value is "+b);
			System.out.println("***********");
			b=n%2;
			System.out.println("now b value is "+b);
			n=n/2;
			b = b+b;
			System.out.println("**********");
			System.out.println("the b value is   "+b);
			
		}
		  
		System.out.println(b);
		
		
		
		sc.close();
		
	}

}
