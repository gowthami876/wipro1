package wipro1;

public class JF8 {
	public static void main(String []args) {
		char colour=args[0].charAt(0);
		switch(colour)
		{
		case'R':System.out.println("RED");
		        break;
		case'G':System.out.println("GREEN");
                break;
		case'O':System.out.println("Orange");
                break;
		case'Y':System.out.println("yellow");
                break;
		case'W':System.out.println("white");
                break;
		default:
			    System.out.println("inalid code");
                break;
		}
	}

}
