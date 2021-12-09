import java.util.Arrays;
import java.util.Scanner;

public class j2
{

	public static void main(String[] args)
	{
		int n[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++)
		{
			n[i] = sc.nextInt();
		}

		// sort
		
		for (int i = 0; i < n.length; i++)
		{
			int swap;
			for (int j = 0; j < n.length - 1; j++)
			{
				if (n[j] < n[j + 1])
				{
					swap = n[j + 1];
					n[j + 1] = n[j];
					n[j] = swap;	
				}
			}
		}
		// display array
		System.out.println(Arrays.toString(n));
	}

}
