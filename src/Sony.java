import java.util.Scanner;

public class Sony {

	public static void getSony() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR SONY CAMERAS");
		System.out.println("***********************************************|");
		int a1=55490; String s1="sony alpha 6000y";
		System.out.println("1.sony alpha 6000y"+"     "+"Rs.55490/-");
		System.out.println("-----------------------------------------------|");
		int a2=82999; String s2="sony alpha 6300m";
		System.out.println("2.sony alpha 6300m"+"     "+"Rs.82999/-");
		System.out.println("-----------------------------------------------|");
		int a3=195990; String s3="sony alpha 7sm2";
		System.out.println("3.sony alpha 7sm2"+"      "+"Rs.195990/-");
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
				getSony();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getSony();
		}						
	}

}
