import java.util.Scanner;

public class Home {

	public static void getHome() 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("                   HOME PAGE                   ");
		System.out.println("***********************************************|");
		System.out.println("What would you like to Shop....!!!!"+"\n");
		System.out.println("CATEGORIES :");
		System.out.println("***********************************************|");
		System.out.println("1.ELECTRONICS");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.FASHION");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.FURNITURE");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.KIDS");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.GROCERY");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.VIEW CART");
		System.out.println("-----------------------------------------------|");
		System.out.println("7.REMOVE CART");
		System.out.println("-----------------------------------------------|");
		System.out.println("8.EXIT");
		System.out.println("-----------------------------------------------|");
		try
		{
			int choice = scn.nextInt();
			switch(choice)
			{
			case 1:
				Electronics.getElectronics();
				break;
			case 2:
				Fashion.getFashion();
				break;
			case 3:
				Furniture.getFurniture();
				break;
			case 4:
				Kids.getKids();
				break;
			case 5:
				Grocery.getGrocery();
				break;
			case 6:
				Cart.viewCart();
				break;
			case 7:
				Cart.removeCart();
				break;
			case 8:
				Exit.getExit();
				break;
			default:
				System.out.println("\n");
				System.out.println("please select the available option");
				getHome();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getHome();
		}

	}
}