import java.util.Scanner;

public class SamsungM {

	public static void getSamsungM() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR SAMSUNG MOBILE PHONES");
		System.out.println("***********************************************|");
		int a1=67990; String s1="galaxy note 9";
		System.out.println("1.galaxy note 9"+"       "+"Rs.67990/-");
		System.out.println("-----------------------------------------------|");
		int a2=64990; String s2="galaxy sp plus";
		System.out.println("2.galaxy s9 plus"+"      "+"Rs.64990/-");
		System.out.println("-----------------------------------------------|");
		int a3=45990; String s3="galaxy A8";
		System.out.println("3.galaxy A8 "+"          "+"Rs.45990/-");
		System.out.println("-----------------------------------------------|");
		int a4=35990; String s4="galaxy A7 ";
		System.out.println("4.galaxy A7"+"           "+"Rs.35990/-");
		System.out.println("-----------------------------------------------|");
		int a5=15990; String s5="galaxy j7 pro";
		System.out.println("5.galaxy j7 pro"+"       "+"Rs.15990/-");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.PREV.PAGE");
		System.out.println("-----------------------------------------------|");
		System.out.println("7.HOME");
		System.out.println("-----------------------------------------------|");
		System.out.println("8.EXIT");
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
				Cart.addCart(a5, s5);
				break;
			case 6:
				Mobiles.getMobiles();
				break;	
			case 7:
				Home.getHome();
				break;
			case 8:
				Exit.getExit();
				break;
			default:
				System.out.println("\n");
				System.out.println("please select the available option");
				getSamsungM();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getSamsungM();
		}									
	}

}
