public class Nine{
	public static void main(String[] args)
	{
		boolean truth = true;
		for (int a = 1; a < 1000 && truth; a++)
		{
			for (int b = 1; b < 1000 && truth; b++)
			{
				for (int c = 1; c < 1000 && truth; c++)
				{
					if (a*a + b*b == c*c)
					{
						if (a+b+c == 1000)
						{
							System.out.println(a*b*c);
							truth = false;
						}
					}
				}
			}
		}
	}
}