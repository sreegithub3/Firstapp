package HomeScreen;

public class deco {
	
	
	public void printstar(int a)
	{
		String s;
		s = "";
		for(int i = 0; i<= a; i++)
		{
			s = s + "*";
		}
			System.out.println(s);
	}

	public void printline(int a)
	{
		String s;
		s = "";
		for(int i = 0; i<= a; i++)
		{
			s = s + "-";
		}
			System.out.println(s);
	}
	
	public void printline()
	{
		String s;
		s = "";
		for(int i = 0; i<= 24; i++)
		{
			s = s + "-";
		}
			System.out.println(s);
	}
}

