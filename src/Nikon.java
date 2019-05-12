import java.util.Scanner;

public class Nikon {

	public static void getNikon()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR NIKON CAMERAS :");
		System.out.println("***********************************************|");
		int a1=30490; String s1="Nikon d3300";
		System.out.println("1.Nikon d3300"+"         "+"Rs.30490/-");
		System.out.println("-----------------------------------------------|");
		int a2=35999; String s2="nikon d3400";
		System.out.println("2.nikon d3400"+"         "+"Rs.35999/-");
		System.out.println("-----------------------------------------------|");
		int a3=95990; String s3="nikon d850";
		System.out.println("3.nikon d850"+"          "+"Rs.95990/-");
		System.out.println("-----------------------------------------------|");
		int a4=52990; String s4="nikon d5400";
		System.out.println("4.nikon d5400"+"         "+"Rs.52990/-");
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
				Cart.addCart(a3, s3);
				break;
			case 4:
				Cart.addCart(a4, s4);
				break;
			case 5:
				Cameras.getCameras();
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
				getNikon();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getNikon();
		}					
	}

}
