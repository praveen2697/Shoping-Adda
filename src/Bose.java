import java.util.Scanner;

public class Bose {

	public static void getBose() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR BOSE DEVICES :");
		System.out.println("***********************************************|");
		int a1=26990; String s1="bose quietcomfort 35";
		System.out.println("1.bose quietcomfort 35"+"               "+"Rs.26990/-");
		System.out.println("-----------------------------------------------|");
		int a2=13990; String s2="bose soundsport bluetooth";
		System.out.println("2.bose soundsport bluetooth"+"          "+"Rs.13990/-");
		System.out.println("-----------------------------------------------|");
		int a3=18990; String s3="bose soundsport free bluetooth";
		System.out.println("3.bose soundsport free bluetooth "+"    "+"Rs.18990/-");
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
				getBose();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getBose();
		}						
	}

}
