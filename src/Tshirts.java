import java.util.Scanner;

public class Tshirts {

	public static void getTshirts() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR TSHIRT BRANDS");
		System.out.println("***********************************************|");
		int a1=999; String s1="U.S.POLO";
		System.out.println("1.U.S.POLO"+"      "+"Rs.999");
		System.out.println("-----------------------------------------------|");
		int a2=599; String s2="ADIDAS";
		System.out.println("2.ADIDAS"+"        "+"Rs.599");
		System.out.println("-----------------------------------------------|");
		int a3=499; String s3="PUM";
		System.out.println("3.PUMA"+"          "+"Rs.499");
		System.out.println("-----------------------------------------------|");
		int a4=799; String s4="ROADSTER";
		System.out.println("4.ROADSTER"+"      "+"Rs.799");
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
				Cart.addCart(a4, s4);
				break;	
			case 5:
				Men.getMen();
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