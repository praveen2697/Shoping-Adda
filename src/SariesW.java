import java.util.Scanner;

public class SariesW {

	public static void getSaries() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR WOMEN SARIES");
		System.out.println("***********************************************|");
		int a1=1500; String s1="devastri";
		System.out.println("1.divastri"+"       "+"Rs.1500/-");
		System.out.println("-----------------------------------------------|");
		int a2=2500; String s2="saara";
		System.out.println("2.saara"+"          "+"Rs.2500/-");
		System.out.println("-----------------------------------------------|");
		int a3=15999; String s3="mimosa";
		System.out.println("3.mimosa"+"         "+"Rs.15999/-");
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
				Cart.addCart(a2, s2);
				break;
			case 4:
				Women.getWomen();
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
				getSaries();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getSaries();
		}							
	}		
}

