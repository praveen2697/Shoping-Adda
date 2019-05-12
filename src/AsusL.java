import java.util.Scanner;

public class AsusL {

	public static void getAsusL() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("LIST OF ASUS LAPTOPS :");
		System.out.println("***********************************************|"); 
		int a1=17990; String s1="APU Quad core E2";
		System.out.println("1.APU Quad core E2"+"               "+"Rs.17990/-");
		System.out.println("-----------------------------------------------|");
		int a2=64990; String s2="vivobook core i5 8th gen";
		System.out.println("2.vivobook core i5 8th gen "+"      "+"Rs.64990/-");
		System.out.println("-----------------------------------------------|");
		int a3=179990; String s3="zenbook pro 15 core 17 8th gen";
		System.out.println("3.zenbook pro 15 core 17 8th gen"+" "+"Rs.179990/-");
		System.out.println("-----------------------------------------------|");
		int a4=44990; String s4="vivobook s14 core i3 8th gen";
		System.out.println("4.vivobook s14 core i3 8th gen"+"   "+"Rs.44990/-");
		System.out.println("-----------------------------------------------|");
		int a5=64990; String s5="zenbook 13 core i5 8th gen";
		System.out.println("5.zenbook 13 core i5 8th gen "+"    "+"Rs.64990/-");
		System.out.println("-----------------------------------------------|");
		System.out.println("6.PREV.PAGE");
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
				getAsusL();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getAsusL();
		}							
	}

}
