package sampleprograms1;

import java.util.*;
public class PrimeNumber_M_to_N 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ms=sc.nextInt();
		int ne=sc.nextInt();
		int count =0;
		for(int i=ms;i<=ne;i++)
		{
			count =0;
			for(int j=2;j<i;j++)
			{
				if(i % j == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				System.out.println(i);
			}
		}

	}

}
