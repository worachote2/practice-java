
public class c5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n = 10,i = 1 ;
		while(i <= 10)
		{   
			int j = 1;
			while(j <= 10)
			{
				if(j>=n-i+1 && j<=n)
				{
					System.out.print("x");
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
