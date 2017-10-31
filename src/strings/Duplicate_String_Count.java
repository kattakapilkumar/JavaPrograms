package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate_String_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		Scanner sc=new Scanner(System.in);
		
		String p = sc.nextLine();				
		String words[] = p.split(" "); 		
		ArrayList al = new ArrayList();
		
		for(String kapil1:words)
		{
			al.add(kapil1);
		}
			
		int size = al.size();
		int wordslen = words.length;
		int foundcount =0;
		for(int x=0;x<wordslen;x++)
		{
			foundcount =0;
			String temp="";
			
		    temp=words[x];
		    if(temp != "\0")
		    {
		    	for(int y=0;y<wordslen;y++)
				{				
					if(temp.equals(words[y]))
					{
						foundcount++;
						words[y] ="\0";
					}
				}		    	
		    	System.out.println(words[x] + ""+ foundcount);
		    }
			
			
		}
		
		
		
	}

}
