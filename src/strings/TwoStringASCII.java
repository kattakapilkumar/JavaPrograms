package strings;

import java.util.*;
public class TwoStringASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		String str=sc.nextLine();
		int l=str.length();
		String str1=str.substring(0,l/2);
		String str2=str.substring(l/2,l);
		System.out.println("****"+str1);
		System.out.println("second string   *****"+str2);
		
		char[] ch2=str2.toCharArray();
		for(int i=0;i<str2.length();i++)
		{
			int value = (int)ch2[i];
			int finalvalue = value +2;
			ch2[i] = (char)finalvalue;				
	    }
		
		String finalstr2 = String.valueOf(ch2);
		char[] ch1=str1.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			int value = (int)ch1[i];
			int finalvalue = value +2;
			ch1[i] = (char)finalvalue;				
	}
		
		String finalstr1 = String.valueOf(ch1);
		StringBuilder sb=new StringBuilder(" ");
		sb.append(finalstr2);
		sb.append(finalstr1);
		
		
		System.out.println("String Builder:::"+sb);
		
		

	}

}
