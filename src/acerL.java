import java.util.Scanner;

public class acerL {

	public static void getacerL() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("LIST OF ACER LAPTOPS :");
		System.out.println("***********************************************|");
		int a1=14990; String s1="Aspire 3 celeron dual core";
		System.out.println("1.Aspire 3 celeron dual core "+"       "+"Rs.14990/-");
		System.out.println("-----------------------------------------------|");
		int a2=41990;String s2="Aspire 5 core i5 7th gen";
		System.out.println("2.Aspire 5 core i5 7th gen "+"         "+"Rs.41990/-");
		System.out.println("-----------------------------------------------|");
		int a3=59990; String s3="nitro 5 Ryzen 5 Quad core";
		System.out.println("3.nitro 5 Ryzen 5 Quad core"+"         "+"Rs.59990/-");
		System.out.println("-----------------------------------------------|");
		int a4=89990; String s4="Predator helios 300 core i7 8th gen";
		System.out.println("4.Predator 300 core i7 8th gen"+"      "+"Rs.89990/-");
		System.out.println("-----------------------------------------------|");
		int a5=28990; String s5="Aspire core i3 6th gen";
		System.out.println("5.Aspire core i3 6th gen "+"           "+"Rs.28990/-");
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
				getacerL();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getacerL();
		}							
	}

}
