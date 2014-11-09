public class Six{
	public static int sumOfSquares(int x)
	{
		int sum = 0;
		for (int i = 1; i <= x; i++)
		{
			sum += i*i;
		}
		return sum;
	}
	
	public static int squareOfSum(int x)
	{
		int sum = 0;
		for (int i = 1; i <= x; i++)
		{
			sum += i;
		}
		return sum*sum;
	}
	
	public static void main(String[] args)
	{
		System.out.println(squareOfSum(100) - sumOfSquares(100));
	}
}