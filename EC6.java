import java.util.Arrays;
import java.util.Scanner;

public class EC6
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n.length;i++)
		{
			n[i] = sc.nextInt();
		}
		
		//sort max to min
		int temp;
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n.length-1;j++)
			{
				if(n[j]<n[j+1])
				{
					temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(n));	
	}

}
