import java.util.Scanner;

public class Canon {

	public static void getCanon() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR CANON CAMERAS :");
		System.out.println("***********************************************|");
		int a1=22490; String s1="canon 1300d";
		System.out.println("1.canon 1300d"+"            "+"Rs.22490/-");
		System.out.println("-----------------------------------------------|");
		int a2=26999; String s2="canon 1400d";
		System.out.println("2.canon 1400d"+"            "+"Rs.26999/-");
		System.out.println("-----------------------------------------------|");
		int a3=32990; String s3="canon 3500d";
		System.out.println("3.canon 3500d"+"            "+"Rs.32990/-");
		System.out.println("-----------------------------------------------|");
		int a4=95990; String s4= "canon mark 4";
		System.out.println("4.canon mark 4"+"           "+"Rs.95990/-");
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
				getCanon();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getCanon();
		}						
	}

}
