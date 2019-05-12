import java.util.Scanner;

public class SamsungTv {

	public static void getSamsungTv() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR SAMSUNG TVs");
		System.out.println("***********************************************|");
		int a1=52490; String s1="on smart 123cm FHD";
		System.out.println("1.on smart 123cm FHD"+"    "+"Rs.52490/-");
		System.out.println("-----------------------------------------------|");
		int a2=61990; String s2="series 7 108cm UHD";
		System.out.println("2.series 7 108cm UHD"+"    "+"Rs.61999/-");
		System.out.println("-----------------------------------------------|");
		int a3=83990; String s3="series 7138cm UHD";
		System.out.println("3.series 7138cm UHD"+"     "+"Rs.83990/-");
		System.out.println("-----------------------------------------------|");
		int a4=289990; String s4="series 8 165cm UHD";
		System.out.println("4.series 8 165cm UHD"+"    "+"Rs.289990/-");
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
				getSamsungTv();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getSamsungTv();
		}								
	}

}
