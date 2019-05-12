import java.util.Scanner;

public class DellL {

	public static void getDellL() 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("LIST OF DELL LAPTOPS ");
		System.out.println("***********************************************|");
		int a1=26490; String s1 ="DELL inspiron 14 core i3 7th gen";
		System.out.println("1.DELL inspiron 14 core i3 7th gen"+" "+"Rs.26,490/-");
		System.out.println("-----------------------------------------------|");
		int a2=26990; String s2 ="DELL vostro 15 core i3 6th gen";
		System.out.println("2.DELLinspiron 15 cotre i7 8th gen"+" "+"Rs.26,990/-");
		System.out.println("-----------------------------------------------|");
		int a3=78955; String s3 ="DELL vostro 15 core i3 6th gen";
		System.out.println("3.DELLinspiron 15 cotre i7 8th gen"+" "+"Rs.78,955/-");
		System.out.println("-----------------------------------------------|");
		int a4=48999; String s4 ="DELL inspiron 15 core i5 8th gen";
		System.out.println("4.DELL inspiron 15 core i5 8th gen"+" "+"Rs.48,999/-");
		System.out.println("-----------------------------------------------|");
		int a5=38889; String s5 ="DELL inspiron 15 core i3 6th gen";
		System.out.println("5.DELL inspiron 15 core i3 6th gen"+" "+"Rs.38,889/-");
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
				Cart.addCart(a1,s1);
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
				getDellL();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getDellL();
		}			
	}

}
