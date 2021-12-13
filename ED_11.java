import java.util.Scanner;

public class ED_11
{

	public static void main(String[] args)
	{
		// POSN M.2 problem
		char a[][] = new char[][]
		{
				{ 'a', 'b', 'c', 'd' },
				{ 'e', 'f', 'g', 'h' },
				{ 'i', 'j', 'k', 'l' },
				{ 'm', 'n', 'o', 'p' } };

		Scanner sc = new Scanner(System.in);
		int num_move = 0;
		char char_move = 't';

		while (true)
		{
			num_move = sc.nextInt();
			if (num_move == -1)
			{
				break;
			}
			char_move = sc.next().charAt(0);

			// change row when 'r' or 'l'
			if (char_move == 'r')
			{
				char temp = a[num_move][a[0].length - 1];
				for (int i = a[0].length - 1; i > 0; i--)
				{
					a[num_move][i] = a[num_move][i - 1];
				}
				a[num_move][0] = temp;
			}

			else if (char_move == 'l')
			{
				char temp = a[num_move][0];
				for (int i = 0; i < a[0].length - 1; i++)
				{
					a[num_move][i] = a[num_move][i + 1];
				}
				a[num_move][a[0].length - 1] = temp;
			}

			// change change column when 'u' or 'd'
			else if (char_move == 'u')
			{
				char temp = a[0][num_move];
				for (int i = 0; i < a.length - 1; i++)
				{
					a[i][num_move] = a[i + 1][num_move];
				}
				a[a.length - 1][num_move] = temp;
			}

			else if (char_move == 'd')
			{
				char temp = a[a.length - 1][num_move];
				for (int i = a.length - 1; i > 0; i--)
				{
					a[i][num_move] = a[i - 1][num_move];
				}
				a[0][num_move] = temp;
			}

			// display
			for (int i = 0; i < a.length; i++)
			{
				for (int j = 0; j < a[0].length; j++)
				{
					System.out.print(a[i][j]);
				}
				System.out.println();
			}

		}
	}

}
