import java.util.Scanner;

public class Electronics 
{
	public static void getElectronics()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("CATEGORIES :");
		System.out.println("***********************************************|");
		System.out.println("1.Laptops");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.Mobiles");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.Televisions");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.Cameras");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.Audio");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.Home");
		System.out.println("-----------------------------------------------|");
		System.out.println("7.Exit");
		System.out.println("-----------------------------------------------|");
		try
		{
			int choice = scn.nextInt();
			switch(choice)
			{
			case 1:
				Laptops.getLaptops();
				break;
			case 2:
				Mobiles.getMobiles();
				break;
			case 3:
				Televisions.getTelevisions();
				break;
			case 4:
				Cameras.getCameras();
				break;
			case 5:
				Audios.getAudios();
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
				getElectronics();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getElectronics();
		}
	}
}