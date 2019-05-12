import java.util.Scanner;

public class Staples {

	public static void getStaples() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR STAPLES ");
		System.out.println("***********************************************|");
		int a1=1000; String s1="dals nd pulses";
		System.out.println("1.dals and pulses"+"Rs.1000/-");
		System.out.println("-----------------------------------------------|");
		int a2=599; String s2="ghee and oils";
		System.out.println("2.ghee and oils"+"Rs.599/-");
		System.out.println("-----------------------------------------------|");
		int a3=299; String s3="atta and flour";
		System.out.println("3.atta and flours"+"Rs.299/-");
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
				Grocery.getGrocery();
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
				getStaples();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getStaples();
		}								
	}

}
