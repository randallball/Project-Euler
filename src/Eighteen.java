import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Eighteen
{
	public static void main(String[] args)
	{
		ArrayList<int[]> bigTriangle = readFile();
		System.out.println(bestLine(bigTriangle));
	}
	
	public static ArrayList<int[]> readFile() 
	{
		ArrayList<int[]> tri = new ArrayList<int[]>();
		try
		{
			File file = new File("/Users/Randall/Documents/Project Euler/src/triangle.txt");
			Scanner triangle = new Scanner(file);
			for (int i = 1; triangle.hasNextInt(); i++)
			{
				int[] temp = new int[i];
				for (int j = 0; j < temp.length; j++)
				{
					temp[j] = triangle.nextInt();
				}
				tri.add(temp);
			}
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("oops");
		}
		return tri;
	}
	
	public static ArrayList<int[]> readFile1() 
	{
		ArrayList<int[]> tri = new ArrayList<int[]>();
		try
		{
			File file = new File("/Users/Randall/Documents/Project Euler/src/Eighteen1.txt");
			Scanner triangle = new Scanner(file);
			for (int i = 1; triangle.hasNextInt(); i++)
			{
				int[] temp = new int[i];
				for (int j = 0; j < temp.length; j++)
				{
					temp[j] = triangle.nextInt();
				}
				tri.add(temp);
			}
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("oops");
		}
		return tri;
	}
	
	public static void printList(ArrayList<int[]> triangle)
	{
		for (int i = 0; i < triangle.size(); i++)
		{
			for (int j = 0; j < triangle.get(i).length; j++)
			{
				System.out.print(triangle.get(i)[j] + " ");
			} 
			System.out.println();
		}
	}
	public static int bestLine(ArrayList<int[]> triangle)
	{
		int best;
		for (int i = triangle.size()-2; i >= 0; i--)
		{
			for (int j = 0; j < triangle.get(i).length; j++)
			{
				best = compareSum(triangle.get(i)[j], triangle.get(i+1)[j], triangle.get(i+1)[j+1]);
				triangle.get(i)[j] = best;
				System.out.print(best + " ");
			}
			System.out.println();
		}
		return triangle.get(0)[0];
	}
	private static int compareSum(int top, int bleft, int bright)
	{
		if (top +  bleft >= top + bright)
		{
			return top + bleft;
		}
		else
		{
			return top + bright;
		}
	}
}