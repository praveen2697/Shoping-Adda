import java.util.Scanner;

public class Grocery 
{
	public static void getGrocery()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("CATEGORIES :");
		System.out.println("***********************************************|");
		System.out.println("1.Staples");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.Snacks and Beverages");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.Packaged Food");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.Household Care");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.Dairy and Eggs");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.HOME");
		System.out.println("-----------------------------------------------|");
		System.out.println("7.EXIT");
		System.out.println("-----------------------------------------------|");
		try
		{
			int choice = scn.nextInt();
			switch(choice)
			{
			case 1:
				Staples.getStaples();
				break;
			case 2:
				SnacksBeverages.getSnacksBeverages();
				break;
			case 3:
				Packaged.getPackaged();
				break;
			case 4:
				Household.getHousehold();
				break;
			case 5:
				Dairy.getDairy();
				break;
			case 6:
				Home.getHome();
				break;
			case 7:
				Exit.getExit();
				break;
			default:
				System.out.println("\n");
				System.out.println("please select the available option");
				getGrocery();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getGrocery();
		}	
	}	
}

