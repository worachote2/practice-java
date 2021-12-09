import java.util.Scanner;

public class j3
{

	public static void main(String[] args)
	{
		int n[] = new int[10];
		Scanner sc = new Scanner(System.in);

		// get input
		for (int i = 0; i < n.length; i++)
		{
			n[i] = sc.nextInt();
		}

		// sort min to max
		int swap;
		for (int k = 0; k < n.length; k++)
		{
			for (int i = 0; i < n.length - 1; i++)
			{
				if (n[i] > n[i + 1])
				{
					swap = n[i + 1];
					n[i + 1] = n[i];
					n[i] = swap;
				}
			}
		}

		//find mendian
		double med;
		med = (n[4]+n[5])/2.0;
		System.out.println(med);
	}

}
