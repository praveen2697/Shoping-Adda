import java.util.Scanner;

public class LgM {

	public static void getLgM() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR LG MOBILE PHONES :");
		System.out.println("***********************************************|");
		int a1=45990; String s1="g7 thinq";
		System.out.println("1.g7 thinq"+"        "+"Rs.45990/-");
		System.out.println("-----------------------------------------------|");
		int a2=55990; String s2="v30";
		System.out.println("2.v30"+"             "+"Rs.55990/-");
		System.out.println("-----------------------------------------------|");
		int a3=17990; String s3="nexus4";
		System.out.println("3.nexus4"+"          "+"Rs.17990/-");
		System.out.println("-----------------------------------------------|");
		int a4=1149; String s4="q6 plus";
		System.out.println("4.q6 plus"+"         "+"Rs.11490/-");
		System.out.println("-----------------------------------------------|");
		int a5=29990; String s5="v20";
		System.out.println("5.v20"+"             "+"Rs.29990/-");
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
				Mobiles.getMobiles();
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
				getLgM();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getLgM();
		}
	}							
}

