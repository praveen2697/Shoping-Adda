import java.util.Scanner;

public class Jeans {

	public static void getJeans() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR JEANS BRANDS");
		System.out.println("***********************************************|");
		int a1=1599; String s1="LEVIS";
		System.out.println("1.LEVIS"+"         "+"Rs1599");
		System.out.println("-----------------------------------------------|");
		int a2=1299; String s2="WRANGLER";
		System.out.println("2.WRANGLER"+"      "+"Rs1299");
		System.out.println("-----------------------------------------------|");
		int a3=1099; String s3="DIESEL";
		System.out.println("3.DIESEL"+"        "+"Rs1099");
		System.out.println("-----------------------------------------------|");
		int a4=999; String s4="LEE";
		System.out.println("4.LEE"+"           "+"Rs999");
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
				Cart.addCart(a1, s1);
				break;
			case 2:
				Cart.addCart(a2, s2);
				break;
			case 3:
				Cart.addCart(a3, s3);
				break;
			case 4:
				Cart.addCart(a4, s4);
				break;	
			case 5:
				Men.getMen();
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
				getJeans();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getJeans();
		}
	}		
}

