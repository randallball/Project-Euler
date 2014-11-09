import java.math.BigInteger;

public class Sixteen
{
	public static void main(String[] args)
	{
		BigInteger x = new BigInteger("2");
		BigInteger two = new BigInteger("2");
		/*for (int i = 0; i < 1000; i++)
		{
			x = x.multiply(two);
			System.out.println(x.toString());
		}
			*/
			x = x.pow(1000);
		System.out.println(x.toString());
		int sum = 0;
		BigInteger remainder = new BigInteger("0");
		while (x.compareTo(BigInteger.ONE) >= 0)
		{
			remainder = x.remainder(BigInteger.TEN);
			System.out.println(remainder.toString());
			sum += remainder.intValue();
			x = x.divide(BigInteger.TEN);
		}
		System.out.println(sum);
	}
}