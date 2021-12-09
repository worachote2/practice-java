
public class c8
{

	public static void main(String[] args)
	{
		int i = 1, n = 10, a = 1;
		while (i <= n)
		{
			int j = 1;
			while (j <= 2 * n)
			{
				if (j >= n - i + 1 && j <= n + i - 1)
				{
					if (i % 2 != 0) // odd row
					{
					
						for (int k = a; k >= 1; k--)
						{
							System.out.print(k);
							
							j++;
						}
					} 
					else // even row
					{
						
						for (int k = 1; k <= a; k++)
						{
							System.out.print(k);
							j++;
						}
					}
				} 
				else if (j >= n + i && j <= 2 * n)
				{
					System.out.print("");
					j++;
				} 
				else
				{
					System.out.print("-");
					j++;
				}
			}
			System.out.println("");
			i++;
			a += 2;
		}

	}

}
