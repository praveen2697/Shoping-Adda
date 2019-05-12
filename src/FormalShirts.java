import java.util.Scanner;

public class FormalShirts {

	public static void getFormalShirts() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR FORMAL SHIRT BRANDS :");
		System.out.println("-----------------------------------------------|");
		int a1=1299; String s1="MONTE CARLO";
		System.out.println("1.MONTE CARLO"+"        "+"Rs.1299");
		System.out.println("-----------------------------------------------|");
		int a2=1099; String s2="PETER ENGLAND";
		System.out.println("2.PETER ENGLAND"+"      "+"Rs.1099");
		System.out.println("-----------------------------------------------|");
		int a3=2099; String s3="BENETTON GROUP";
		System.out.println("3.BENETTON GROUP"+"     "+"Rs.2099");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.PREV. PAGE");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.HOME");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.EXIT");
		System.out.println("-----------------------------------------------|");
		try
		{
			int choice = scn.nextInt();
			switch(choice)
			{
			case 1:
				Cart.addCart(a1, s1);
				break;
			case 2:
				Cart.addCart(a2, s2);
				break;
			case 3:
				Cart.addCart(a3, s3);
				break;
			case 4:
				Men.getMen();
				break;
			case 5:
				Home.getHome();
				break;
			case 6:
				Exit.getExit();
				break;
			default:
				System.out.println("\n");
				System.out.println("please select the available option");
				getFormalShirts();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getFormalShirts();
		}		
	}

}
