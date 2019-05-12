import java.util.Scanner;

public class Furniture
{
	public static void getFurniture() 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("CATEGORIES :");
		System.out.println("***********************************************|");
		System.out.println("1.Bedroom");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.LivingAndDining");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.Kitchen");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.HomeFurnishing");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.HomeDecore");
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
				Bedroom.getBedroom();
				break;
			case 2:
				LivingAndDining.getLivingAndDining();
				break;
			case 3:
				Kitchen.getKitchen();
				break;
			case 4:
				HomeFurnishing.getHomeFurnishing();
				break;
			case 5:
				HomeDecore.getHomeDecore();
				break;
			case 6:
				Home.getHome();
				break;
			case 8:
				Exit.getExit();
				break;
			default:
				System.out.println("\n");
				System.out.println("please select the available option");
				getFurniture();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getFurniture();
		}	
	}

}
