package wipro1;

public class JF9 {
	public static void main(String [] args) {
		if(args.length==0)
		System.out.println("enter month");
		else
		{
			int n= Integer.parseInt(args[0]);
			switch(n) {
			case 1:System.out.println("January");
			        break;
			case 2:System.out.println("February");
	               break;
			case 3:System.out.println("march");
	              break;
			case 4:System.out.println("april");
	              break;
			case 5:System.out.println("may");
	               break;
			case 6:System.out.println("June");
	               break;
			case 7:System.out.println("July");
	               break;
			case 8:System.out.println("august");
	               break;
			case 9:System.out.println("sep");
	                break;
			case 10:System.out.println("october");
	                break;
			case 11:System.out.println("november");
	                break;
			case 12:System.out.println("december");
	                break;
	        default:
	                System.out.println("invalid");
	                 break;
			}        
		}
			}

}
