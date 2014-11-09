import java.math.BigInteger;
public class Twenty
{
	public static void main(String[] args)
	{
		BigInteger x = new BigInteger("100");
		//System.out.println(factorial(x));
		System.out.println(sumDigits(factorial(x)));
	}
	
	public static BigInteger factorial(BigInteger x)
	{
		long a = x.longValue();
		for (long i = a-1; i > 0; i--)
		{
			x = x.multiply(BigInteger.valueOf(i));
		}
		return x;
	}
	public static BigInteger sumDigits(BigInteger x)
	{
		BigInteger sum = new BigInteger("0");
		BigInteger[] temp = new BigInteger[2];
		while (x.compareTo(BigInteger.ZERO) == 1)
		{
			temp = x.divideAndRemainder(BigInteger.TEN);
			sum = sum.add(temp[1]);
			x = temp[0];
		}
		return sum;
	}
}