package wipro1;

public class JF6 {
	public static void main(String[] args)
	{
		String a=args[0];
		int age= Integer.parseInt(args[1]);
		if(a.equals("female"))
		{
			if(age>1 && age<58)
				System.out.println("percentage of interest is 8.2%");
			if(age>59 && age<100)
				System.out.println("percentage of interest is 9.2%");		
		}
		if(a.equals("male"))
		{
			if(age>1 && age<58)
				System.out.println("percentage of interest is 8.4%");
			if(age>59 && age<100)
				System.out.println("percentage of interest is 10.5%");		
		}
		
	}

}
