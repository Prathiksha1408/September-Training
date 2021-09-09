package training;

public class Pattern2
{
	public static void test(int n)
	{
		int n1=164;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(++n1 + "  ");
				//n1++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		test(5);
	}
}
