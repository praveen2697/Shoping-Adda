import java.util.Scanner;

public class Household {

	public static void getHousehold() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR HOUSE HOLD CARE :");
		System.out.println("***********************************************|");
		int a1=1000; String s1="detergents and laundry";
		System.out.println("1.detergents and laundry"+"       "+"Rs.1000/-");
		System.out.println("-----------------------------------------------|");
		int a2=599; String s2="utensil cleaners";
		System.out.println("2.utensil cleaners"+"             "+"Rs.599/-");
		System.out.println("-----------------------------------------------|");
		int a3=299; String s3="floor and other cleaners";
		System.out.println("3.floor and other cleaners"+"     "+"Rs.299/-");
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
				Grocery.getGrocery();
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
				getHousehold();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getHousehold();
		}
	}								
}

