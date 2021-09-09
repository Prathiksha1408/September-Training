package training;

public class DispPattern
{
	final private static String SPACE =" ";

    private boolean flag = false;

    private int start;

    private int end;

    // constructors

    public DispPattern() 
    {
    	start = 10;
    	end = 5;
    }
    public DispPattern(int start,int end)
    {
    	this.start = start;
    	this.end = checkEndValue(end);
    }
    private int checkEndValue(int end)
    {
    	if (end > 15)
    		end = 15;
    		return end;
    }
    public void display()
    {
    	for(int i=1;i<=end;i++)
    	{
    		for(int j=end-1;j>=i;j--)
    		{
    			System.out.print(SPACE);
    		}
    		for(int k=1;k<=i;k++)
    		{
    			System.out.print(start+SPACE);
    			flag = true;
    		}
    		start++;
    		System.out.println();
    	}
    	dispErrMsg();
    }
    private void dispErrMsg() 
    {
    	if (!flag)
    	{
    		System.out.println("hello the end value is "+end+" it is not ok.  Reinitialse !!  ");
    	}
    }

}
public class DispPattern 
{
	public static void main(String[] args) 
	{
		PyramidPattern objDispPattern  = new PyramidPattern();

         objDispPattern.display();

         System.out.println("----------------------------------------------");

         objDispPattern  = new PyramidPattern(45,80);

         objDispPattern.display();
	}
}



 

