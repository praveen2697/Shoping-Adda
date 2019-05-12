import java.util.Scanner;

public class HomeDecore {

	public static void getHomeDecore() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR HOME DECORE ITEMS :");
		System.out.println("***********************************************|");
		int a1=35000; String s1="paints";
		System.out.println("1.paints "+"       "+"Rs.35000/-");
		System.out.println("-----------------------------------------------|");
		int a2=599; String s2="clocks";
		System.out.println("2.clocks"+"        "+"Rs.599/-");
		System.out.println("-----------------------------------------------|");
		int a3=299; String s3="show pieces";
		System.out.println("3.show pieces"+"   "+"Rs.299/-");
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
				getHomeDecore();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getHomeDecore();
		}

	}
}
