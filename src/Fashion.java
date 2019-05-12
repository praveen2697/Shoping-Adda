import java.util.Scanner;

public class Fashion
{
	public static void getFashion()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("CATEGORIES :");
		System.out.println("***********************************************|");
		System.out.println("1.Men");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.Women");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.Footwear");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.Watches");
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
				Men.getMen();
				break;
			case 2:
				Women.getWomen();
				break;
			case 3:
				Footwear.getFootwear();
				break;
			case 4:
				Watches.getWatches();
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
				getFashion();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getFashion();
		}
	}	
}

