import java.math.*;
import java.util.*;
public class Twelve{
	public static void main(String[] args)
	{
		int number = 1;
		int i = 0;
		while (divisors(i) < 500)
		{
			System.out.println(i);
			i += number;
			number++;
		}
		System.out.println(i);
	}
	
	public static int divisors(int n)
	{
		int divisors = 0;
		for (int i = 1; i < Math.sqrt(n); i++)
		{
			if (n%i == 0)
			{
				divisors += 2;
			}
		}
		return divisors;
	}
}