import java.math.BigInteger;
public class TwentyFive
{
	public static void main(String[] args)
	{
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("1");
		int i = 1;
		while (true)
		{
			if (digits(c) == 1000)
			{
				System.out.println(i + "  " + c);
				break;
			}
			c = a.add(b);
			a = b;
			b = c;
			i++;
		}
	}
	
	public static int digits(BigInteger n)
	{
		int digits = 0;
		while (n.compareTo(BigInteger.ZERO) > 0)
		{
			n = n.divide(BigInteger.TEN);
			digits++;
		}
		
		return digits;
	}
}