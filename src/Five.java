public class Five{
	public static void main(String[] args)
	{
		int i = 2;
		while (true)
		{
			if (divisible(i))
			{
				System.out.println(i);
				break;
			}
			i += 2;
		}
	}
	
	public static boolean divisible(int x)
	{
		for (int i = 1; i <= 20; i++)
		{
			if (x % i != 0)
			{
				return false;
			}
		}
		return true;
	}
}