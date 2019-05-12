import java.util.Scanner;

public class Audios {

	public static void getAudios() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR BRANDS :");
		System.out.println("***********************************************|");
		System.out.println("1.BOSE");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.SONY");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.JBL");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.PREV.PAGE");
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
				Bose.getBose();
				break;
			case 2:
				SonyAud.getSonyAud();
				break;
			case 3:
				Jbl.getJbl();
				break;
			case 4:
				Electronics.getElectronics();
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
				getAudios();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getAudios();
		}					
	}

}
