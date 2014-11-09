public class Seven{
	public static boolean isPrime(int x)
	{
		if (x % 2 == 0)
		{
			return false;
		}
		for (int i = 3; i < x; i+= 2)
		{
			if (x % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		int j = 0;
		for (int i = 0; j < 10001; i++)
		{
			if (isPrime(i))
			{
				System.out.println(i);
				j++;
			}
		}
	}
}