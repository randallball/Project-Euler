public class TwentyOne
{
	public static int d(int n) //works!
	{
		int sum = 0;
		for (int i = 1; i < n/2 + 1; i++)
		{
			if (n % i == 0)
			{
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 2; i <= 10000; i++)
		{
			if (d(d(i)) == i && d(i) != i)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
}