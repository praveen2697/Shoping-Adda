import java.util.Scanner;

public class Western {

	public static void getWestern() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR WOMEN WESTERN WEAR");
		System.out.println("***********************************************|");
		int a1=799; String s1="little black dress";
		System.out.println("1.little black dress"+"Rs.799/-");
		System.out.println("-----------------------------------------------|");
		int a2=1599; String s2="skinny fit jeans";
		System.out.println("2.skinny fit jeans"+"Rs.1599/-");
		System.out.println("-----------------------------------------------|");
		int a3=5999; String s3="solid puffer jackets";
		System.out.println("3.solid puffer jackets"+"Rs.5999/-");
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
				getWestern();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getWestern();
		}						
	}

}
