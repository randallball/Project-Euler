import java.util.*;
public class ProblemFour{
	public static boolean isPalendrome(int x)
	{
		return (x == reverse(x));
	}
	
	public static int reverse(int x)
	{
		int y = 0;
		while (x > 0)
		{
			int a = x % 10;
			y = y * 10 + a;
			x = x/10;
		}
		return y;
	}
	
	public static void main(String[] args)
	{
		List<Integer> palendromes = new ArrayList<Integer>();
		for (int a = 999; a > 500; a--)
		{
			for (int b = 999; b > 500; b--)
			{
				if (isPalendrome(a*b))
				{
					palendromes.add(a*b);
				}
			}
		}
		System.out.println(Collections.max(palendromes));
	}
}