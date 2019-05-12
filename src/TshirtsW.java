import java.util.Scanner;

public class TshirtsW {

	public static void getTshirts() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR WOMEN TSHIRTS");
		System.out.println("***********************************************|");
		int a1=635; String s1="puma";
		System.out.println("1.puma"+"          "+"Rs.635/-");
		System.out.println("-----------------------------------------------|");
		int a2=555; String s2="adidas";
		System.out.println("2.adidas"+"        "+"Rs.999/-");
		System.out.println("-----------------------------------------------|");
		int a3=555; String s3="uspolo";
		System.out.println("3.uspolo"+"        "+"Rs.555/-");
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
				getTshirts();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getTshirts();
		}							
	}		
}
