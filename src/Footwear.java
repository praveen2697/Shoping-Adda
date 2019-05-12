import java.util.Scanner;

public class Footwear {

	public static void getFootwear() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("CATEGORIES :");
		System.out.println("***********************************************|");
		System.out.println("1.SHOES");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.SANDLES");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.FLIP FLOPS");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.SLIPPERS");
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
				Shoes.getShoes();
				break;
			case 2:
				Sandles.getSandles();
				break;
			case 3:
				Flipflop.getFlipflop();
				break;
			case 4:
				Slippers.getSlippers();
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
				getFootwear();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getFootwear();
		}				
	}

}
