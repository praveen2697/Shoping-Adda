import java.util.Scanner;

public class Laptops 
{
	public static void getLaptops() 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR BRANDS :");
		System.out.println("***********************************************|");
		System.out.println("1.DELL");
		System.out.println("-----------------------------------------------|");
		System.out.println("2.Lenovo");
		System.out.println("-----------------------------------------------|");
		System.out.println("3.Hp");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.Apple");
		System.out.println("-----------------------------------------------|");
		System.out.println("5.acer");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.ASUS");	
		System.out.println("-----------------------------------------------|");
		System.out.println("7.PREV. PAGE");
		System.out.println("-----------------------------------------------|");
		System.out.println("8.HOME");
		System.out.println("-----------------------------------------------|");
		System.out.println("9.EXIT");
		System.out.println("-----------------------------------------------|");
		try
		{
			int choice = scn.nextInt();
			switch(choice)
			{
			case 1:
				DellL.getDellL();
				break;
			case 2:
				LenovoL.getLenovoL();
				break;
			case 3:
				HpL.getHpL();
				break;
			case 4:
				AppleL.getAppleL();
				break;
			case 5:
				acerL.getacerL();
				break;
			case 6:
				AsusL.getAsusL();
				break;
			case 7:
				Electronics.getElectronics();
				break;
			case 8:
				Home.getHome();
				break;
			case 9:
				Exit.getExit();
				break;
			default:
				System.out.println("\n");
				System.out.println("please select the available option");
				getLaptops();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getLaptops();
		}
	}	
}

