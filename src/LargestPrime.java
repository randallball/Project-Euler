import java.util.*;
import java.math.*;
public class LargestPrime{
	
	public static void main(String[] args)
	{
		BigInteger x = new BigInteger("600851475143");
		for (BigInteger y = BigInteger.ONE; y.compareTo(x) < 0; y = y.add(BigInteger.valueOf(1)))
		{
			if (x.remainder(y).compareTo(BigInteger.ZERO) == 0)
			{
				if (y.isProbablePrime(1))
				{
					System.out.println(y.toString());
				}
			}
		}
	}
}