import java.util.Scanner;

public class GoogleM {

	public static void getGoogleM() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR GOOGLE MOBILE PHONES :");
		System.out.println("***********************************************|");
		int a1=83990; String s1="PIXEL 3 XL";
		System.out.println("1.PIXEL 3 XL"+"         "+"Rs.83990/-");
		System.out.println("-----------------------------------------------|");
		int a2=71990; String s2="PIXEL 3";
		System.out.println("2.PIXEL 3"+"            "+"Rs.71990/-");
		System.out.println("-----------------------------------------------|");
		int a3=42990; String s3="PIXEL 2 XL";
		System.out.println("3.PIXEL 2 XL "+"        "+"Rs.42990/-");
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
				Mobiles.getMobiles();
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
				getGoogleM();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getGoogleM();
		}								
	}

}
