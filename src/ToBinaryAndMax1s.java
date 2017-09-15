import java.util.*;

public class ToBinaryAndMax1s {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		int b=0;
		int binary =0 ;
		while(n!=0)
		{
			//System.out.println("*****#########******");
			//System.out.println("the n value is  "+n);
			//System.out.println("***********");
			b=binary*10;
			//System.out.println("now b value is "+b);
			//System.out.println("***********");
			if(n == 2)
			{
				//System.out.println("the binary value is   "+binary);
				//System.out.println(" the b value  "+b);
				b=b*10;
				//System.out.println(" the new b value  "+b);
				binary = b + 1;
				
				n=0;
				//System.out.println("the binary value is  "+binary);
			}
			else
			{
				 binary=n%2;
				// System.out.println("now binary value is "+binary);
				 n=n/2;
				 binary = b + binary;
			}
			
			
			
			//System.out.println("**********");
			//System.out.println("the binary value is   "+binary);
			//System.out.println("*****#########******");
		}
		  
		//System.out.println(binary);
		
		String s=String.valueOf(binary);
		//System.out.println(s);
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String finals=sb.toString();
		//System.out.println("the final string is "+finals);
		//System.out.println("the string length is "+finals.length());
		ArrayList al = new ArrayList();
		int count =0;
		for(int i=0;i<finals.length();i++)
		{
			
			if(finals.charAt(i) == '1')
			{
				//System.out.println("the ***value*** is "+finals.charAt(i));
				//System.out.println("now the count is "+count);
				count++;
				//System.out.println("now the count is "+count);
				al.add(count);
				//System.out.println("now the count is added to arraylist "+count);
			}
			else
			{
				al.add(count);
				count =0;
			}
			
			
		}
		//Iterator itr=al.iterator();
		//while(itr.hasNext()) 
		//{
		//	System.out.println(itr.next());
		//}
		int finalcount=(int) Collections.max(al);
		System.out.println(finalcount);
		sc.close();
		
	}

}
