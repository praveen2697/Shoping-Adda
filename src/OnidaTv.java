import java.util.Scanner;

public class OnidaTv {

	public static void getOnidaTv() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR ONIDA TVs :");
		System.out.println("***********************************************|");
		int a1=52490; String s1="147cm UHD";
		System.out.println("1.147cm UHD"+"        "+"Rs.52490/-");
		System.out.println("-----------------------------------------------|");
		int a2=17999; String s2="80cm HD";
		System.out.println("2.80cm HD"+"          "+"Rs.17999/-");
		System.out.println("-----------------------------------------------|");
		int a3=27990; String s3="106cm FHD";
		System.out.println("3.106cm FHD"+"        "+"Rs.27990/-");
		System.out.println("-----------------------------------------------|");
		int a4=33190; String s4="109cm UHD";
		System.out.println("4.109cm UHD"+"        "+"Rs.33190/-");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.PREV. PAGE");
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
				Cart.addCart(a3 ,s3);
				break;
			case 4:
				Cart.addCart(a4, s4);
				break;
			case 5:
				Televisions.getTelevisions();
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
				getOnidaTv();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getOnidaTv();
		}							
	}

}
