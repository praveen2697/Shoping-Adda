import java.util.Scanner;

public class SonyAud {

	public static void getSonyAud() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR SONY DEVICES");
		System.out.println("***********************************************|");
		int a1=990; String s1="sony 310ap wired headset";
		System.out.println("1.sony 310ap wired headset"+"   "+"Rs.990/-");
		System.out.println("-----------------------------------------------|");
		int a2=590; String s2="sony ex14xp wired headset";
		System.out.println("2.sony ex14xp wired headset"+"  "+"Rs.590/-");
		System.out.println("-----------------------------------------------|");
		int a3=2990; String s3="sony c300 bluetooth";
		System.out.println("3.sony c300 bluetooth"+"        "+"Rs.2990/-");
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
				Audios.getAudios();
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
				getSonyAud();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getSonyAud();
		}								
	}

}
