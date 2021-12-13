
public class Fractal
{
	public int numerator;
	public int denominator;

	// method
	// add
	public Fractal fractal_add(Fractal x)
	{
		Fractal result;
		result = new Fractal();

		result.numerator = (numerator * x.denominator) + (x.numerator * denominator);
		result.denominator = denominator * x.denominator;

		int gcd = GCD(result.numerator, result.denominator);
		result.numerator /= gcd;
		result.denominator /= gcd;
		return result;
	}

	// minus
	public Fractal minus(Fractal x)
	{
		Fractal result;
		result = new Fractal();

		result.numerator = (numerator * x.denominator) - (x.numerator * denominator);
		result.denominator = denominator * x.denominator;

		int gcd = GCD(result.numerator, result.denominator);
		result.numerator /= gcd;
		result.denominator /= gcd;
		return result;
	}

	// multiply
	public Fractal multiply(Fractal x)
	{
		Fractal result;
		result = new Fractal();

		result.numerator = numerator * x.numerator;
		result.denominator = denominator * x.denominator;
        
		int gcd = GCD(result.numerator, result.denominator);
		result.numerator /= gcd;
		result.denominator /= gcd;
		return result;
	}

	// divide
	public Fractal divide(Fractal x)
	{
		Fractal result;
		result = new Fractal();
		result.numerator = numerator * x.denominator;
		result.denominator = denominator * x.numerator;

		int gcd = GCD(result.numerator, result.denominator);
		result.numerator /= gcd;
		result.denominator /= gcd;
		return result;
	}

	public static int GCD(int x, int y)
	{
		if (x < y)
		{
			int temp = x;
			x = y;
			y = temp;
		}

//		while (y != 0)
//		{
//			int temp;
//			x = x % y;
//			temp = x;
//			x = y;
//			y = temp;
//		}

		int gcd = 1;
		for (int i = y; i > 0; i--)
		{
			if (x % i == 0 && y % i == 0)
			{
				gcd = i;
				break;
			}
		}
		return gcd;
	}

}
