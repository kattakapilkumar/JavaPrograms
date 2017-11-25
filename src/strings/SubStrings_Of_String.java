package strings;
import java.util.*;
public class SubStrings_Of_String 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		String s="kapil";
		int slen = s.length();
		ArrayList al = new ArrayList();
		
		//sinlge words
		for(int i=0;i<slen;i++)
		{
			al.add(s.substring(i, i+1));
		}
	    Iterator itr = al.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
		
		
		
		

	}
}
