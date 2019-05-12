import java.util.Scanner;

public class Toys {

	public static void getToys() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR KIDS TOYS ");
		System.out.println("***********************************************|");
		int  a1=2000; String s1="racing cars";
		System.out.println("1.racing cars"+"         "+"Rs.2000/-");
		System.out.println("-----------------------------------------------|");
		int a2=599; String s2="remote cars";
		System.out.println("2.remote cars"+"         "+"Rs.599/-");
		System.out.println("-----------------------------------------------|");
		int a3=2500; String s3="legos";
		System.out.println("3.legos"+"               "+"Rs.2500/-");
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
				Kids.getKids();
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
				getToys();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getToys();
		}								
	}

}
