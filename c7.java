
public class c7
{

	public static void main(String[] args)
	{
	   int i = 1,n = 10, count = 1;
	   while( i <= n)
	   {
		   int j = 1;
		   while(j <= 2*n)
		   {
			   if(j >= n-i+1 && j <= n+i-1)
			   {
				   System.out.print(count);
					if(j>=n)
					{
						count--;
					}
					else if(j<n) 
					{
						count++;
					}
					//System.out.print(count);
			   }
			   else if(j >= n+i && j <= 2*n) 
			   {
				   System.out.print("");
			   }
			   else {
				   System.out.print("-");
			   }
			   j++;   
		   }
		   count = 1;
		   i++;
		   System.out.println("");
	   }

	}

}
