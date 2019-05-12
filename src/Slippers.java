import java.util.Scanner;

public class Slippers {

	public static void getSlippers() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR SLIPPERS");
		System.out.println("***********************************************|");
		int a1=1650; String s1="nike";
		System.out.println("1.nike"+"      "+"Rs.1650/-");
		System.out.println("-----------------------------------------------|");
		int a2=1500; String s2="crocs";
		System.out.println("2.crocs"+"     "+"Rs.1500/-");
		System.out.println("-----------------------------------------------|");
		int a3=999;String s3="kraasa";
		System.out.println("3.kraasa"+"    "+"Rs.999/-");
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
				Footwear.getFootwear();
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
				getSlippers();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getSlippers();
		}							
	}

}
