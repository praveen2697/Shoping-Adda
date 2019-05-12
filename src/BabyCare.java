import java.util.Scanner;

public class BabyCare {

	public static void getBabyCare() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR BABY CARE ITEMS ");
		System.out.println("-----------------------------------------------|");
		int a1=259; String s1="diapers";
		System.out.println("1.diapers"+"Rs.259/-");
		int a2=599; String s2="bath and grooming";
		System.out.println("2.bath and grooming"+"Rs.599/-");
		int a3=2599; String s3="baby gear";
		System.out.println("3.baby gear"+"Rs.2599/-");
		System.out.println("4.previous page");
		System.out.println("5.Home");
		System.out.println("6.Exit");
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
				Cart.addCart(a3,s3);
				break;
			case 4:
				Kids.getKids();
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
				getBabyCare();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getBabyCare();
		}								
	}

}
