package training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrays
{
	public static void main(String[] args)
	{
		List<String> l = new ArrayList<String>();
		l.add("Prathiksha");
		l.add("Vinutha");
		l.add("Sameer");
		l.add("Anjali");
		l.add("Gagana");
		/*
		 * //System.out.println(l); //if(l.charAt[0]=='S' || l.charAt[0]=='G')
		 * l.remove("Sameer"); l.remove("Gagana"); System.out.println(l);
		 */
		List<String> lit = new ArrayList<String>();
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			String i = it.next();
			if(l.charAt(0)=='S' || l.charAt(0)=='G')
			{
				lit.add(li.get(i));
			}
		}
	}
}
