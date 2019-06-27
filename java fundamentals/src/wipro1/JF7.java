package wipro1;
 import java.util.Scanner;
 
public class JF7 {
  public static void main(String[] args)
  {
	int i,ln;
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
    String str=sc.nextLine();
	
    ln =str.length();
    for(i=0;i<=ln;i++)
    {
    	ch=str.charAt(i);
    	
    	if(Character.isUpperCase(ch))
    		System.out.println (Character . toLowerCase(ch));
    	else
    		System.out.println (Character . toUpperCase(ch));	
    }	
  }
}
