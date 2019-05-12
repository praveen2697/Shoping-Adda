import java.util.Scanner;

public class SonyTv {

	public static void getSonyTv() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR SONY TVs");
		System.out.println("***********************************************|");
		int a1=19490; String s1="r202f 80cm HD";
		System.out.println("1.r202f 80cm HD"+"Rs.19490/-");
		System.out.println("-----------------------------------------------|");
		int a2=37999; String s2="r252f 101cm FHD";
		System.out.println("2.r252f 101cm FHD"+"Rs.37999/-");
		System.out.println("-----------------------------------------------|");
		int a3=61990; String s3="android 108cm UHD";
		System.out.println("3.android 108cm UHD"+"Rs.61990/-");
		System.out.println("-----------------------------------------------|");
		int a4=99999; String s4="android 138cm UHD";
		System.out.println("4.android 138cm UHD"+"Rs.99999/-");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.PREV.PAGE");
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
				getSonyTv();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getSonyTv();
		}					
	}

}
