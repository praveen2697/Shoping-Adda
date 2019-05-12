import java.util.Scanner;

public class Jbl {

	public static void getJbl() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR JBL DEVICES :");
		System.out.println("***********************************************|");
		int a1=2490; String s1="jbl t160bt bluetooth";
		System.out.println("1.jbl t160bt bluetooth"+"        "+"Rs.2490/-");
		System.out.println("-----------------------------------------------|");
		int a2=2490; String s2="jbl t250si wired headphones";
		System.out.println("2.jbl t250si wired headphones"+" "+"Rs.2490/-");
		System.out.println("-----------------------------------------------|");
		int a3=790; String s3="jbl t110 headset with mic";
		System.out.println("3.jbl t110 headset with mic"+"   "+"Rs.790/-");
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
				Audios.getAudios();
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
				getJbl();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getJbl();
		}
	}					
}

