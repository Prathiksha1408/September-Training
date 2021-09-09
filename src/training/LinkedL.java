package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedL 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(14);
		li.add(20);
		li.add(56);
		li.add(73);
		li.add(100);
		li.add(44);
		li.add(16);
		li.add(76);
		li.add(138);
		List<Integer> lit = new ArrayList<Integer>();
		int i;
		int total = 0;
	    int avg;
		for(i=0;i<li.size();i++)
		{
			int n = li.get(i);
			if(n>49 && n<151)
			{
				lit.add(li.get(i));
			}
		}
		for(i=0;i<li.size();i++)
		{
			int n = li.get(i);
			if(n>0 && n<50)
			{
				lit.add(li.get(i));
			}
		}
		System.out.println(lit);
		/*
		 * List<Integer> lis = new ArrayList<Integer>(); lis.addAll(lit);
		 * System.out.println(lis);
		 */
		int max = Collections.max(lit);
        System.out.println("Maximum is : " + max);
  
        int min = Collections.min(lit);
        System.out.println("Minimum is : " + min);
        for(i = 0; i < li.size(); i++)
        total= total+ li.get(i);
        avg = total / li.size();
        System.out.println("Average is: " + avg);
	
	}
	
}