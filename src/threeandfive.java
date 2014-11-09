public class threeandfive{
	public static void main(String[] args)
	{
		int sum3 = 0;
		int sum5 = 0;
		for (int i = 0; i <= 1000; i += 3)
		{
			sum3 += i;
		}
		for (int j = 0; j <= 1000; j += 5)
		{
			if (j%15 != 0)
			{
			sum5 += j;
			}
		}

		int sum = sum3 + sum5;
		System.out.println(sum);
	}
}