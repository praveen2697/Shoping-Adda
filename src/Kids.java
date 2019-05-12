import java.util.Scanner;

public class Kids
{
	public static void getKids() 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("CATEGORIES :");
		System.out.println("***********************************************|");
		System.out.println("1.KidsFassion");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.Toys");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.School");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.BabyCare");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.SkinCare");
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
				KidsFassion.getKidsFassion();
				break;
			case 2:
				Toys.getToys();
				break;
			case 3:
				School.getSchool();
				break;
			case 4:
				BabyCare.getBabyCare();
				break;
			case 5:
				SkinCare.getSkinCare();
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
				getKids();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getKids();
		}
	}	
}	
