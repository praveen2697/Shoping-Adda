import java.util.Scanner;

public class Televisions {

	public static void getTelevisions() 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR BRANDS");
		System.out.println("***********************************************|");
		System.out.println("1.SAMSUNG");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.LG");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.SONY");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.ONIDA");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.Panasonic");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.PREV.PAGE");
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
				SamsungTv.getSamsungTv();
				break;
			case 2:
				LgTv.getLgTv();
				break;
			case 3:
				SonyTv.getSonyTv();
				break;
			case 4:
				OnidaTv.getOnidaTv();
				break;
			case 5:
				PanasonicTv.getPanasonicTv();
				break;
			case 6:
				Electronics.getElectronics();
				break;
			case 7:
				Home.getHome();
				break;
			default:
				System.out.println("\n");
				System.out.println("please select the available option");
				getTelevisions();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getTelevisions();
		}			
	}

}
