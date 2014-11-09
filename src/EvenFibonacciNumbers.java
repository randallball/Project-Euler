public class EvenFibonacciNumbers{
	public static int[] fib(int i)
	{
		int[] fib = new int[i];
		//initial values.
		fib [0] = 0;
		fib [1] = 1;
		
		//fill the array.
		for (int j = 2; j < i; j++)
		{
			fib[j] = fib[j-2] + fib[j-1];
		}
		return fib;
	}
	
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
		int[] fib = fib(34);
		while (i < 34)
		{
			if (fib[i] % 2 == 0)
			{
				sum += fib[i];
			}
			i++;
		}
		System.out.println(sum);
	}
}