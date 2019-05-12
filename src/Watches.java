import java.util.Scanner;

public class Watches {

	public static void getWatches() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR WATCHES");
		System.out.println("***********************************************|");
		int a1=20000; String s1="rolex";
		System.out.println("1.ROLEX"+"Rs.20000");
		System.out.println("-----------------------------------------------|");
		int a2=2500; String s2="FOGG";
		System.out.println("2.FOGG"+"2500");
		System.out.println("-----------------------------------------------|");
		int a3=5000; String s3="LOIS CARON";
		System.out.println("3.LOIS CARON"+"5000");
		System.out.println("-----------------------------------------------|");
		int a4=15000; String s4="CASADO";
		System.out.println("4.CASADO"+"15000");
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
				Cart.addCart(a4, s4);;
				break;
			case 5:
				Fashion.getFashion();
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
				getWatches();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getWatches();
		}						
	}

}
