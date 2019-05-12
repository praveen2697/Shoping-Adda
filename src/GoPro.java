import java.util.Scanner;

public class GoPro {

	public static void getGoPro() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR GO PRO CAMERAS :");
		System.out.println("***********************************************|");
		int a1=30490; String s1="1.go pro hero 4";
		System.out.println("1.go pro hero 4"+"      "+"Rs.30490/-");
		System.out.println("-----------------------------------------------|");
		int a2=35990; String s2="go pro hero 5";
		System.out.println("2.go pro hero 5"+"      "+"Rs.35999/-");
		System.out.println("-----------------------------------------------|");
		int a3=50990; String s3="go pro hero 7";
		System.out.println("3.go pro hero 7"+"      "+"Rs.50990/-");
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
				Cameras.getCameras();
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
				getGoPro();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getGoPro();
		}						
	}

}
