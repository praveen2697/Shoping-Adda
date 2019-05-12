import java.util.Scanner;

public class LenovoL {

	public static void getLenovoL() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("LIST OF LENOVO LAPTOPS :");
		System.out.println("***********************************************|");
		int a1=25990; String s1="LENOVO ideapad 320 core i3 6th gen";
		System.out.println("1.LENOVO ideapad 320 core i3 6th gen"+"Rs.25990/-");
		System.out.println("-----------------------------------------------|");
		int a2=43990; String s2="LENOVO ideapad 330 core i5 8th gen";
		System.out.println("2.LENOVO ideapad 330 core i5 8th gen"+"Rs.43990/-");
		System.out.println("-----------------------------------------------|");
		int a3=36990; String s3="LENOVO ideapad 130 core i5 8th gen";
		System.out.println("3.LENOVO ideapad 130 core i5 8th gen"+"Rs.36990/-");
		System.out.println("-----------------------------------------------|");
		int a4=49990; String s4="LENOVO ideapad 330 core i5 8th gen";
		System.out.println("4.LENOVO ideapad 330 core i5 8th gen"+"Rs.49990/-");
		System.out.println("-----------------------------------------------|");
		int a5=67990; String s5="LENOVO ideapad 520 core i5 8th gen";
		System.out.println("5.LENOVO ideapad 520 core i5 8th gen"+"Rs.67990/-");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.PREV. PAGE");
		System.out.println("-----------------------------------------------|");
		System.out.println("7.HOME");
		System.out.println("-----------------------------------------------|");
		System.out.println("8.EXIT");
		System.out.println("-----------------------------------------------|");
		try
		{
			int choice = scn.nextInt();
			switch(choice)
			{
			case 1:
				Cart.addCart(a1,s1);
				break;
			case 2:
				Cart.addCart(a2,s2);
				break;
			case 3:
				Cart.addCart(a3, s3);
				break;
			case 4:
				Cart.addCart(a4, s5);
				break;
			case 5:
				Cart.addCart(a5, s5);
				break;
			case 6:
				Laptops.getLaptops();
				break;	
			case 7:
				Home.getHome();
				break;
			case 8:
				Exit.getExit();
				break;
			default:
				System.out.println("\n");
				System.out.println("please select the available option");
				getLenovoL();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getLenovoL();
		}
	}					
}

