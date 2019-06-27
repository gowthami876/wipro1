package wipro1;

public class JF14 {
	public static void main(String args[])
	{
		int c=0;
		if(args.length==0)
			System.out.println("enter a value");
		else
			{
				int n= Integer.parseInt(args[0]);
				if(n==1)
					System.out.println("prime nor composite");
				else if(n==0)
					System.out.println("prime nor composite");
				for(int i=1;i<=n;i++)
				{
					if(n%i==0)
						c++;
				}
				if (c==2)
					System.out.println("prime ");
				else
					System.out.println("not a prime ");
			}
	}

}
