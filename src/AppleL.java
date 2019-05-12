import java.util.Scanner;

public class AppleL {

	public static void getAppleL() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("LIST OF APPLE LAPTOPS :");
		System.out.println("***********************************************|");
		int a1=67990; String s1=".Macbook air core i5 5th gen";
		System.out.println("1.Macbook air core i5 5th gen"+"      "+"Rs.67990");
		System.out.println("-----------------------------------------------|");
		int a2=104990; String s2="Macbook  core m3 7th gen";
		System.out.println("2.Macbook  core m3 7th gen"+"         "+"Rs.104990");
		System.out.println("-----------------------------------------------|");
		int a3=231990; String s3="Macbook pro core i7 8th gen";
		System.out.println("3.Macbook pro core i7 8th gen"+"      "+"Rs.231990");
		System.out.println("-----------------------------------------------|");
		int a4=75990; String s4="Macbook air core i5 6th gen";
		System.out.println("4.Macbook air core i5 6th gen"+"      "+"Rs.75990");
		System.out.println("-----------------------------------------------|");
		int a5=99990; String s5="Macbook air core i7 7th gen";
		System.out.println("5.Macbook air core i7 7th gen"+"      "+"Rs.99990");
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
				getAppleL();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getAppleL();
		}					
	}

}
