import java.util.Scanner;

public class Mobiles 
{
	public static void getMobiles() 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR BRANDS :");
		System.out.println("***********************************************|");
		System.out.println("1.SAMSUNG");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.LG");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.Apple");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.Google");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.Huawei");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.PREV. PAGE");
		System.out.println("-----------------------------------------------|");
		System.out.println("7.HOME");
		System.out.println("-----------------------------------------------|");
		System.out.println("8.EXIT");
		System.out.println("-----------------------------------------------|");
		try
		{
			int choice = scn.nextInt();
			switch(choice)
			{
			case 1:
				SamsungM.getSamsungM();
				break;
			case 2:
				LgM.getLgM();
				break;
			case 3:
				AppleM.getAppleM();
				break;
			case 4:
				GoogleM.getGoogleM();
				break;
			case 5:
				HuaweiM.getHuaweiM();
				break;
			case 6:
				Electronics.getElectronics();
				break;
			case 7:
				Home.getHome();
				break;
			case 8:
				Exit.getExit();
				break;
			default:
				System.out.println("\n");
				System.out.println("please select the available option");
				getMobiles();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getMobiles();
		}	
	}

}
