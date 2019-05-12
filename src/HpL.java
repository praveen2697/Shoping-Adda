import java.util.Scanner;

public class HpL {

	public static void getHpL() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("LIST OF HP LAPTOPS :");
		System.out.println("***********************************************|");
		int a1=32990; String s1="HP 15 core i3 7th gen";
		System.out.println("1.HP 15 core i3 7th gen "+"      "+"Rs.32990/-");
		System.out.println("-----------------------------------------------|");
		int a2=41990; String s2="HP 15q core i5 7th gen ";
		System.out.println("2.HP 15q core i5 7th gen "+"     "+"Rs.41990/-");
		System.out.println("-----------------------------------------------|");
		int a3=27990;String s3="HP 15q core i3 7th gen ";
		System.out.println("3.HP 15q core i3 7th gen "+"     "+"Rs.27990/-");
		System.out.println("-----------------------------------------------|");
		int a4=46990; String s4="HP 15q core i5 8th gen";
		System.out.println("4.HP 15q core i5 8th gen "+"     "+"Rs.46990/-");
		System.out.println("-----------------------------------------------|");
		int a5=21990; String s5="HP 15q dual core";
		System.out.println("5.HP 15q dual core "+"           "+"Rs.21990/-");
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
				getHpL();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getHpL();
		}
	}					
}

