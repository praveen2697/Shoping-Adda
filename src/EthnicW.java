import java.util.Scanner;

public class EthnicW {

	public static void getEthnic() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR WOMEN ETHNIC WEARS :");
		System.out.println("***********************************************|");
		int a1=2500; String s1="kurtas";
		System.out.println("1.kurtas"+"           "+"Rs.2500/-");
		System.out.println("-----------------------------------------------|");
		int a2=3999; String s2="lehenga";
		System.out.println("2.lehenga"+"          "+"Rs.3999/-");
		System.out.println("-----------------------------------------------|");
		int a3=999; String s3="leggings";
		System.out.println("3.leggings"+"         "+"Rs.999/-");
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
				getEthnic();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getEthnic();
		}						
	}

}
