import java.util.Scanner;

public class EF_NT_02_Julian_Date
{
	public static int checkJD(int y,int m,int d)
	{
		if(y<1582)
		{
			return 1;
		}
		else if(y>1582) 
		{
			return 0;
		}
		else
		{
			if(m<10) return 1;
			else if(m>10) return 0;
			else
			{
				if(d<5) return 1;
				else if(d>14) return 0;
			}
		}
		return 1;
	}
	public static double DateToJD(int y,int m,int d)
	{
		int JD = checkJD(y, m, d);
		int M=m>2 ? m:m+12;
		int Y = m>2 ? y:y-1;
		double D = d;
		
		int B = (JD==1) ? 0:2 - Y/100 + Y/100/4;
		
		return (int)(365.25*(Y+4716))+(int)(30.6001*(M+1))+D+B-1524.5;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int D,M,Y;
		D = sc.nextInt(); M=sc.nextInt(); Y=sc.nextInt();
		
		System.out.println((int)DateToJD(Y, M, D));
	}

}
