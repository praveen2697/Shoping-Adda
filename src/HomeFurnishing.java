import java.util.Scanner;

public class HomeFurnishing {

	public static void getHomeFurnishing() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR HOME FURNISHING ITEMS ");
		System.out.println("-----------------------------------------------|");
		int a1=500; String s1="bedsheets";
		System.out.println("1.bedsheets"+"Rs.500/-");
		int a2=499; String s2="blankets";
		System.out.println("2.blankets"+"Rs.499/-");
		int a3=999; String s3="curtains";
		System.out.println("3.curtains"+"Rs.999/-");
		System.out.println("4.previous page");
		System.out.println("5.Home");
		System.out.println("6.Exit");
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
				Furniture.getFurniture();
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
				getHomeFurnishing();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getHomeFurnishing();
		}
	}							
}

