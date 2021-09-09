package training;

public class Pattern1
{
	public static void test(int n)
	{
		int n1 = 16;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(n1++ + "  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		test(1);
	}
}
