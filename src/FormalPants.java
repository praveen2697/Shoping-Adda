import java.util.Scanner;

public class FormalPants {

	public static void getFormalPants() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR FORMAL PANT BRANDS :");
		System.out.println("***********************************************|");
		int a1=2099; String s1="JHON PLAYERS";
		System.out.println("1.JHON PLAYERS"+"        "+"Rs.2099");
		System.out.println("-----------------------------------------------|");
		int a2=3999; String s2="RAYMOND";
		System.out.println("2.RAYMOND"+"             "+"Rs.3999");
		System.out.println("-----------------------------------------------|");
		int a3=1990; String s3="VAN HEUSEN";
		System.out.println("3.VAN HEUSEN"+"          "+"Rs.1990");
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
				Men.getMen();
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
				getFormalPants();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getFormalPants();
		}		
	}

}
