import java.util.Scanner;

public class Sandles {

	public static void getSandles() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR SANDLES");
		System.out.println("***********************************************|");
		int a1=1650; String s1="adidas";
		System.out.println("1.adidas"+"      "+"Rs.1650/-");
		System.out.println("-----------------------------------------------|");
		int a2=250; String s2="puma";
		System.out.println("2.puma"+"        "+"Rs.250/-");
		System.out.println("-----------------------------------------------|");
		int a3=999; String s3="loto";
		System.out.println("3.loto"+"        "+"Rs.999/-");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.PREV.PAGE");
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
				getSandles();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getSandles();
		}							
	}

}
