import java.util.Arrays;
import java.util.Scanner;

public class EC9
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int expo, n[], n_count = 0;
		expo = sc.nextInt();

		n = new int[100];
		for (int i = 0; i < n.length; i++)
		{
			n[i] = sc.nextInt();
			if (n[i] == -999)
			{
				n[i] = 0;
				break;
			}
			n_count++;
		}
		// convert array n[] to k[]
		int k[] = new int[n_count];
		for (int i = 0; i < k.length; i++)
		{
			k[i] = n[i];
		}
		// System.out.println("prn = "+Arrays.toString(k));

		double a, b, result, c[];
		a = sc.nextDouble();
		b = sc.nextDouble();

		double sum_a = 0, sum_b = 0 ;
		int expo_temp = expo;

		// set up with a
		for (int i = 0; i < k.length; i++)
		{
			if(expo != -1)
			{
				sum_a += (k[i] * Math.pow(a, expo + 1.0)) / (expo + 1);
			}
			else 
			{
				sum_a += (k[i] * Math.log(a));
			}
			expo -= 1;
		}
		
		expo = expo_temp;
		//set up with b
		for (int i = 0; i < k.length; i++)
		{
			if(expo != -1)
			{
				sum_b += (k[i] * Math.pow(b, expo + 1.0)) / (expo + 1);
			}
			else 
			{
				sum_b += (k[i] * Math.log(b));
			}
			expo -= 1;
		}	
		
		result = sum_b - sum_a ;
		System.out.println(result);

	}

}
