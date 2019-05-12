import java.util.Scanner;

public class School {

	public static void getSchool() {
		Scanner scn = new Scanner(System.in);
		System.out.println("***********************************************|");
		System.out.println("MOST POPULAR KIDS SCHOOL ITEMS");
		System.out.println("***********************************************|");
		int a1=999; String s1="school bags";
		System.out.println("1.school bags"+"      "+"Rs.999/-");
		System.out.println("-----------------------------------------------|");
		int a2=199; String s2="water bags";
		System.out.println("2.water bottles"+"    "+"Rs.199/-");
		System.out.println("-----------------------------------------------|");
		int a3=299; String s3="books";
		System.out.println("3.books"+"            "+"Rs.299/-");
		System.out.println("-----------------------------------------------|");
		System.out.println("4.PREV.PAGE");
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
				Cart.addCart(a3, s3);;
				break;
			case 4:
				Kids.getKids();
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
				getSchool();
			}
		}
		catch(Exception e)
		{
			System.out.println("please select the valid option ");
			getSchool();
		}								
	}

}
