import java.util.Scanner;

public class HuaweiM {

	public static void getHuaweiM() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR HUAWEI MOBILE PHONES :");
		System.out.println("***********************************************|");
		int a1=85990; String s1="MATE 20 PRO";
		System.out.println("1.MATE 20 PRO"+"         "+"Rs.85990/-");
		System.out.println("-----------------------------------------------|");
		int a2=16999; String s2="P20 LITE";
		System.out.println("2.P20 LITE"+"            "+"Rs.16999/-");
		System.out.println("-----------------------------------------------|");
		int a3=11999; String s3="HONOR 9N";
		System.out.println("3.HONOR 9N"+"            "+"Rs.11999/-");
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
				getHuaweiM();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getHuaweiM();
		}
	}								
}

