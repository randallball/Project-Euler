public class Ten{
	public static void main(String[] args)
	{
		long sum = 2L;
		for (int i = 3; i < 2000000; i+=2)
		{
			if (isPrime(i))
			{
				sum = sum + i; 
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime(int x)
	{
		for (int i = 2; i < x/2 + 1; i++)
		{
			if (x%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}