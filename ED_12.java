import java.util.Scanner;

public class ED_12
{

	public static void main(String[] args)
	{
	
		String a = new Scanner(System.in).nextLine();

		// convert string to each char then convert to int
		int num[] = new int[a.length()];

		// String that ready for print
		String s[][] = new String[][]
		{
				// 0
				{
				  "xxxx", 
				  "x--x", 
				  "x--x", 
				  "x--x", 
				  "xxxx" 
				 },
				//1
				{
				  "---x", 
				  "---x", 
				  "---x",
				  "---x",
				  "---x" 
				 },
				//2
				{
				  "xxxx",
				  "---x",
				  "xxxx", 
				  "x---",
				  "xxxx"
				 },
				//3
				{ 
				  "xxxx",
				  "---x",
				  "xxxx",
				  "---x",
				  "xxxx"
				 },
				//4
				{ 
			      "x--x",
			      "x--x",
			      "xxxx",
			      "---x", 
			      "---x" 
			      },
				//5
				{ 
			      "xxxx", 
			      "x---", 
			      "xxxx", 
			      "---x", 
			      "xxxx" },
				//6
				{ 
			      "x---",
			      "x---", 
			      "xxxx", 
			      "x--x", 
			      "xxxx" 
			      },
				//7
				{ 
			      "xxxx", 
			      "---x", 
			      "---x", 
			      "---x", 
			      "---x" 
			      },
				//8
				{ 
			      "xxxx", 
			      "x--x", 
			      "xxxx", 
			      "x--x", 
			      "xxxx"
			     },
				//9
				{ 
			      "xxxx", 
			      "x--x", 
			      "xxxx", 
			      "---x", 
			      "---x"
			      } 
			    };
				
	   for (int i = 0; i < num.length; i++)
		{
			num[i] = Integer.parseInt("" + a.charAt(i));
		}			    

		// let's print LED
		for (int i = 0; i < s[0].length; i++)
		{
			for (int j = 0; j < a.length(); j++)
			{
				System.out.print(s[ num[ j ] ][ i ]+"\t");
			}
			System.out.println();
		}
	}

}
