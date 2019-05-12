import java.util.Scanner;

public class AppleM {

	public static void getAppleM() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR APPLE MOBILE PHONES :");
		System.out.println("***********************************************|");
		int a1=140990; String s1="IPHONE 10 s max";
		System.out.println("1.IPHONE 10 s max"+"        "+"Rs.140990/-");
		System.out.println("-----------------------------------------------|");
		int a2=89990; String s2="IPHONE 10 s";
		System.out.println("2.IPHONE 10 s"+"            "+"Rs.89990/-");
		System.out.println("-----------------------------------------------|");
		int a3=75990; String s3="IPHONE 10";
		System.out.println("3.IPHONE 10"+"              "+"Rs.75990/-");
		System.out.println("-----------------------------------------------|");
		int a4=55990; String s4="IPHONE 8 plus";
		System.out.println("IPHONE 8 plus"+"            "+"Rs.55990/-");
		System.out.println("-----------------------------------------------|");
		int a5=50990; String s5="IPHONE 8";
		System.out.println("5.IPHONE 8"+"               "+"Rs.50990/-");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.PREV. PAGE");
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
				getAppleM();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getAppleM();
		}								
	}

}
