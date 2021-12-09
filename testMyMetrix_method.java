package practice_K1;

import java.util.Scanner;

public class testMyMetrix_method
{
	// method for sum

	// print sum
	public static void sumMetrixPrint(int result_sum[][])
	{
		System.out.println("Sum of two metrics : ");
		for (int i = 0; i < result_sum.length; i++)
		{
			for (int j = 0; j < result_sum[0].length; j++)
			{
				System.out.print(result_sum[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// find sum
	public static void sumTwoMetrix(int a[][], int b[][])
	{
		int a_row = a.length;
		int a_col = a[0].length;
		int b_row = b.length;
		int b_col = b[0].length;
		int result_sum[][], sum_row, sum_col;
		// check dimension first
		if (a_row == b_row && a_col == b_col)
		{
			sum_row = a_row;
			sum_col = a_col;
			result_sum = new int[sum_row][sum_col];
			for (int i = 0; i < result_sum.length; i++)
			{
				for (int j = 0; j < result_sum[0].length; j++)
				{
					result_sum[i][j] = a[i][j] + b[i][j];
				}
			}

			// print sum of metrix
			sumMetrixPrint(result_sum);
		} else
		{
			System.out.println("can't find sum of these two metrics because of dimension");
		}
	}

	// method for multiply
	// print muultiple
	public static void mulPrint(int result_mul[][])
	{
		System.out.println("Sum of two metrics : ");
		for (int i = 0; i < result_mul.length; i++)
		{
			for (int j = 0; j < result_mul[0].length; j++)
			{
				System.out.print(result_mul[i][j]+"\t");
			}
			System.out.println();
		}
	}

	// find multiple
	public static void mulTwoMetrix(int a[][], int b[][])
	{
		int result_mul[][] = new int[a.length][b[0].length];
		if (a[0].length == b.length)
		{
			for (int i = 0; i < result_mul.length; i++)
			{
				for (int j = 0; j < result_mul[0].length; j++)
				{
					int sum = 0;
					for (int k = 0; k < b.length; k++)
					{
						sum += (a[i][k] * b[k][j]);
					}
					result_mul[i][j] = sum;
				}
			}

			// print multiple of two metrics
			mulPrint(result_mul);
		} else
		{
			System.out.println("can't find multiple of these two metrics because of dimension");
		}

	}

	// Main
	public static void main(String[] args)
	{
		int a[][], a_row, a_col;
		int b[][], b_row, b_col;

		// get input for two metrix
		Scanner sc = new Scanner(System.in);

		// metrix a
		System.out.println("Enter row of metrix a : ");
		a_row = sc.nextInt();
		System.out.println("Enter column of metrix a : ");
		a_col = sc.nextInt();

		a = new int[a_row][a_col];
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{

			for (int j = 0; j < a[0].length; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		// metrix b
		System.out.println("Enter row of metrix b : ");
		b_row = sc.nextInt();
		System.out.println("Enter column of metrix b : ");
		b_col = sc.nextInt();

		b = new int[b_row][b_col];
		System.out.println();
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[0].length; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}

		// use method to find sum of two metric
		sumTwoMetrix(a, b);
		//use method to find multiple of two metric
		mulTwoMetrix(a, b);
	}

}
