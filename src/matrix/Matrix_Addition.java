package matrix;

import java.util.*;
public class Matrix_Addition 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		
		int m1[][] = new int[r1][c1];
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				m1[i][j] = sc.nextInt();
			}
		}
	
		//printing the matrix .....  
		for(int x=0;x<r1;x++)
		{
			for(int y=0;y<c1;y++)
			{
				System.out.print(m1[x][y]+" ");
			}
			System.out.println();
		}
		
		
	}

}
