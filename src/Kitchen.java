import java.util.Scanner;

public class Kitchen {

	public static void getKitchen() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR KITCHEN ITEMS :");
		System.out.println("***********************************************|");
		int a1=5000; String s1="pressure cookers";
		System.out.println("1.pressure cookers "+"      "+"Rs.5000/-");
		System.out.println("-----------------------------------------------|");
		int a2=1599; String s2="gas stoves";
		System.out.println("2.gas stoves"+"             "+"Rs.1599/-");
		System.out.println("-----------------------------------------------|");
		int a3=999; String s3="kitchen tools";
		System.out.println("3.kitchen tools"+"          "+"Rs.999/-");
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
				getKitchen();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getKitchen();
		}
	}							
}
