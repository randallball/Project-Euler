public class FourMilfib{
	public static void main(String[] args)
	{
		int i = 30;
		int[] fib = fib(40);
		while (fib[i] <= 4000000)
		{
			i++;
		}
		System.out.println(i);
	}
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
}