import java.util.Scanner;

public class LgTv {

	public static void getLgTv() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR LG TVs :");
		System.out.println("***********************************************|");
		int a1=20490; String s1="smart 80cm HD";
		System.out.println("1.smart 80cm HD"+"         "+"Rs.20490/-");
		System.out.println("-----------------------------------------------|");
		int a2=39999; String s2="smart 108cm FHD";
		System.out.println("2.smart 108cm FHD"+"       "+"Rs.39999/-");
		System.out.println("-----------------------------------------------|");
		int a3=52490; String s3="smart 138cm UHD";
		System.out.println("3.smart 138cm UHD"+"       "+"Rs.66990/-");
		System.out.println("-----------------------------------------------|");
		int a4=52490; String s4="smart 108cm UHD";
		System.out.println("4.smart 108cm UHD"+"       "+"Rs.46990/-");
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
				Televisions.getTelevisions();
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
				getLgTv();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getLgTv();
		}							
	}

}
