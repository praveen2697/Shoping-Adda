import java.util.Scanner;

public class PanasonicTv {

	public static void getPanasonicTv() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR PANASONIC TVs");
		System.out.println("***********************************************|");
		int a1=16490; String s1="panasonic 80cm FHD";
		System.out.println("1.panasonic 80cm FHD"+"Rs.16490/-");
		System.out.println("-----------------------------------------------|");
		int a2=29399; String s2="panasonic f200 series 108cm FHD";
		System.out.println("2.panasonic f200 series 108cm FHD"+"Rs.29399/-");
		System.out.println("-----------------------------------------------|");
		int a3=39990; String s3="panasonic 109cm UHD";
		System.out.println("3.panasonic 109cm UHD"+"Rs.39990/-");
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
				Televisions.getTelevisions();
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
				getPanasonicTv();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getPanasonicTv();
		}							
	}

}
