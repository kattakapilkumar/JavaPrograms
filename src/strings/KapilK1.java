package strings;

import java.util.*;
public class KapilK1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner kapil=new Scanner(System.in);
		
		
		String s=kapil.nextLine();
		char ch=kapil.next().charAt(0);
		
		
		
		//String newstr=s.replaceAll("k","1");
		
		char[] ch1=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i) == ch)
			{
				ch1[1]='1';
				
			}
			
			
		}
		
		String newstr=String.valueOf(ch1);
		
		System.out.println(newstr);
		//System.out.println(s);
		

	}

}
