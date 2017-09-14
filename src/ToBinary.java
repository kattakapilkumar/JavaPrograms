import java.util.*;

public class ToBinary {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int b=0;
		while(n>=0)
		{
			b=b*10;
			b=n%2;
			n=n/2;
			b = b+b;
			
		}
		  
		System.out.println(b);
		
		
		
		sc.close();
		
	}

}
