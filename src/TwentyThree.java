import java.util.ArrayList;
public class TwentyThree
{
	public static void main(String[] args)
	{
		System.out.println(nonAbundant(abundant()));
	}
	
	public static ArrayList<Integer> abundant()
	{
		ArrayList<Integer> abundants = new ArrayList<Integer>();
		for (int i = 0; i < 28123; i++)
		{
			if (isAbundant(i))
			{
				abundants.add(i);
			}
		}
		return abundants;
	}
	
	public static boolean isAbundant(int n)
	{
		int sum = 0;
		for (int i = 1; i < n; i++)
		{
			if (n % i == 0)
			{
				sum += i;
			}
		}
		if (sum > n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int nonAbundant(ArrayList<Integer> abundants)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 28123; i++)
		{
			numbers.add(i);
		}
		
		for (int first = 0; first < abundants.size(); first++)
		{
			for (int second = first; second < abundants.size(); second++)
			{
				Integer temp = new Integer(abundants.get(first) + abundants.get(second));
				numbers.remove(temp);
			}
		}
		System.out.println("Done");
		int summation = 0;
		for (int a = 0; a < numbers.size(); a++)
		{
			summation += numbers.get(a);
		}
		return summation;
	}
}