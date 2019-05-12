import java.util.Scanner;

public class Women {

	public static void getWomen() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("CATEGORIES");
		System.out.println("***********************************************|");
		System.out.println("1.T SHIRTS");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.SARIES");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.ETHNIC WEAR");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.WESTERN WEAR");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.PREV.PAGE");
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
				TshirtsW.getTshirts();
				break;
			case 2:
				SariesW.getSaries();
				break;
			case 3:
				EthnicW.getEthnic();
				break;
			case 4:
				Western.getWestern();
				break;	
			case 5:
				Fashion.getFashion();
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
				getWomen();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getWomen();
		}					

	}
}