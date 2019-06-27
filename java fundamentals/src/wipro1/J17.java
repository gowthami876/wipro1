package wipro1;

public class J17 {
	public static void main(String args [])
	{
		int num=678,rev=0;
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
			System.out.println("reversed number is " + rev);
		}
	}

}
