import java.util.Scanner;

public class Cameras {

	public static void getCameras()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR BRANDS :");
		System.out.println("***********************************************|");
		System.out.println("1.NIKON");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.CANON");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.SONY");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.GO PRO");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.PREV. PAGE");
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
				Nikon.getNikon();
				break;
			case 2:
				Canon.getCanon();
				break;
			case 3:
				Sony.getSony();
				break;
			case 4:
				GoPro.getGoPro();
				break;
			case 5:
				Electronics.getElectronics();
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
				getCameras();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getCameras();
		}			
	}

}
