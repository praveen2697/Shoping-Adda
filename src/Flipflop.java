import java.util.Scanner;

public class Flipflop {

	public static void getFlipflop() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR FLIP FLOPS");
		System.out.println("***********************************************|");
		int a1=450; String s1="puma";
		System.out.println("1.puma"+"         "+"Rs.450/-");
		System.out.println("-----------------------------------------------|");
		int a2=250; String s2="paragon";
		System.out.println("2.paragon"+"      "+"Rs.250/-");
		System.out.println("-----------------------------------------------|");
		int a3=300; String s3="lunars";
		System.out.println("3.lunars"+"       "+"Rs.300/-");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.PREV. PAGE");
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
				Cart.addCart(a1, s1);
				break;
			case 2:
				Cart.addCart(a2, s2);
				break;
			case 3:
				Cart.addCart(a3, s3);
				break;
			case 4:
				Footwear.getFootwear();
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
				getFlipflop();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getFlipflop();
		}							
	}

}
