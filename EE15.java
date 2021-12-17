import java.util.Scanner;

public class EE15
{

	public static void main(String[] args)
	{
		
		int n; Scanner sc =new Scanner(System.in); n = sc.nextInt();
		
		int a[][] = new int[n][n];
	    //calculate
		a[0][0] = 1;
		
		//start from second row
		//fist of every row is 1
		for(int i=1;i<n;i++)
   		{
			a[i][0]=1;
			for(int j=1;j<=i;j++)
			{
				a[i][j] = a[i-1][j-1]+a[i-1][j]; 
			}
		}
		
		//display
		for(int i=0;i<a.length;i++)
		{
			//tab space
			for(int k=0;k<n-i-1;k++)
			{
				System.out.print("\t");
			}
			//print value
			for(int j=0;j<=i;j++)
			{
				if(j==i)
				{
					System.out.print(a[i][j]);
				}
				else System.out.print(a[i][j]+"\t\t");
			}
			System.out.println();
		}
		
	//System.out.println(a[3][3]);
	
	}

}
