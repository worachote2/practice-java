import java.util.Arrays;
import java.util.Scanner;

public class EC5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++)
		{
			n[i] = sc.nextInt();
		}
		int v, v_index;
		v = sc.nextInt();
		v_index = sc.nextInt();
		
		// เริ่มขยับจากช่องท้ายของ array
		for (int i = n.length - 1; i > v_index; i--)
		{
			n[i] = n[i - 1];
		}
		
		// แทน ค่า v ลง v_index ที่ต้องการ
		n[v_index] = v;
		System.out.println(Arrays.toString(n));

	}
}
