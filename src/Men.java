import java.util.Scanner;

public class Men {

	public static void getMen() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("CATEGORIES :");
		System.out.println("-----------------------------------------------|");
		System.out.println("1.T SHIRTS");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.JEANS");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.FORMAL SHIRTS");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.FORMAL PANTS");
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
				Tshirts.getTshirts();
				break;
			case 2:
				Jeans.getJeans();
				break;
			case 3:
				FormalShirts.getFormalShirts();
				break;
			case 4:
				FormalPants.getFormalPants();
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
				getMen();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getMen();
		}					
	}

}
