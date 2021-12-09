package practice_K1;

import java.util.Scanner;

public class testMyMetrix
{

	public static void main(String[] args)
	{
		// Write program to find sum and multiple of two metrix
		int a[][], a_row, a_col;
		int b[][], b_row, b_col;
		int result_sum[][], sum_row, sum_col;
		int result_mul[][], mul_row, mul_col;

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

		// find sum of two metrix

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

			// finally , print sum metrix
			System.out.println("Sum of two metrics : ");
			for (int i = 0; i < result_sum.length; i++)
			{
				for (int j = 0; j < result_sum[0].length; j++)
				{
					System.out.print(result_sum[i][j] + "\t");
				}
				System.out.println();
			}
		} else
		{
			System.out.println("can't find sum of these two metrics because of dimension");
		}

		// find multiple of two metrix

		// first check dimesion
		if (a_col == b_row)
		{
			mul_row = a_row;
			mul_col = b_col;
			result_mul = new int[mul_row][mul_col];
			for (int i = 0; i < result_mul.length; i++)
			{
				for (int j = 0; j < result_mul[0].length; j++)
				{
					int sum = 0;
					for (int k = 0; k < b_row; k++)
					{
						sum += (a[i][k] * b[k][j]);
					}
					result_mul[i][j] = sum;
				}
			}

			// finally print multiple of two metric
			System.out.println("Multiple of two metric : ");
			for (int i = 0; i < result_mul.length; i++)
			{
				for (int j = 0; j < result_mul[0].length; j++)
				{
					System.out.println(result_mul[i][j]+"\t");
				}
				System.out.println();
			}

		} else
		{
			System.out.println("can't find multiple of these two metrics " + "because of dimension");
		}
	}

}
