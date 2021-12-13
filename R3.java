import java.util.Scanner;

public class R3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Fractal a,b;
		a = new Fractal(); 
		b = new Fractal();
		Scanner sc = new Scanner(System.in);
		
		a.numerator = 6;
		a.denominator = 3;
		
		b.numerator = 2;
		b.denominator = 4;
		
		Fractal c ;
		c = a.fractal_add(b);
		System.out.println(c.numerator+"/"+c.denominator);
		
		c=a.minus(b);
		System.out.println(c.numerator+"/"+c.denominator);

		c=a.multiply(b);
		System.out.println(c.numerator+"/"+c.denominator);		
	
		c=a.divide(b);
		System.out.println(c.numerator+"/"+c.denominator);		
		
		System.out.println(Fractal.GCD(30,12 ));
	}

}
