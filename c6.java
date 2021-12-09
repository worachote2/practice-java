
public class c6
{

	public static void main(String[] args)
	{
		int i = 1 , n=10 ;
		while(i <= 10)
		{
			int j = 1;
			while(j <= 2*n)
			{
				if(j >= n-i+1 && j <= i+n-1)
				{
					System.out.print("x");
				}
				else if(j>=i+n && j<= 2*n)
				{
					System.out.print("");
				}
				else
				{
					System.out.print("-");
				}
				j++;
			}
			System.out.println("");
			i++;
		}

	}

}
