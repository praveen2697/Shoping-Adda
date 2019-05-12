import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cart
{
	private static final String Qty = null;
	static ArrayList b=new ArrayList();
	public static void addCart(int a1,String s1) 
	{
		int Qty = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the Quantity");
		System.out.println();
		Qty=sc.nextInt();
		System.out.println("are you sure want to add"+" "+ Qty+" "+"items to cart");
		System.out.println("Do you want to continue? Y/N");
		char choice=sc.next().charAt(0);
		if(choice=='Y'||choice=='y') 
		{
			System.out.println("\n");
			System.out.println(Qty +" Item Added to Cart");
		}
		else if(choice=='N'||choice=='n')
		{
			Home.getHome();
		}
		else {
			System.out.println("\n\n");
			System.out.println("Enter the valid input");
			System.out.println();
			viewCart();
		}

		System.out.println();
		b.add(s1);
		b.add(Qty);
		b.add(a1);
		Home.getHome();

	}
	public static void ext()
	{
		System.out.println("\n\n\n\n\n\n");
		if(b.size()>0) {
			int total=0;
			int Qty=0;
			System.out.println("*****************************************    ShoppingAdda Bill   ********************************************|");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -|");
			Date dNow = new Date();
			SimpleDateFormat ft= new  SimpleDateFormat("E yyyy.MM.dd                                                  'Time:' hh:mm:ss a zzz");
			System.out.println(" Date:"+ft.format(dNow)+"|");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -|");
			System.out.printf("%-8s %-40s %-8s %-8s %-8s\n", "SI.No", "Item","Qty","Cost","Total");
			int j=1;
			for(int i=0;i<b.size();i++) {
				int t1=(int) b.get(i+1);
				int t2=(int) b.get(i+2);

				total+=(t1*t2);
				Qty+=t1;
				System.out.printf("%-8s %-40s %-8s %-8s %-8s\n",(j),b.get(i),b.get(i+1),b.get(i+2),(t1*t2));
				i++;
				i++;
				j++;
			}
			float cgst=total*(9f/100f);
			float sgst=total*(9f/100f);
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -|");
			System.out.println();
			System.out.printf("%s %-38s %s","Total Qty:","",Qty);
			System.out.println();
			System.out.printf("%s %-54s %s","Sub Total:","",total);
			System.out.println();
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -|");
			System.out.println();
			System.out.printf("%s %-55s %s","CGST @6%:","",cgst);
			System.out.println();
			System.out.printf("%s %-55s %s","SGST @9%:","",sgst);
			System.out.println();
			System.out.printf("%s %-54s %s","Total GST:","",cgst+sgst);
			System.out.println();
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -|");
			System.out.println();
			System.out.printf("%s %-52s %s","Grand Total:","",(float)(total+sgst+cgst));
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("*********************************   THANKH YOU FOR SHOPPING   ***********************************************|");
			return;
		}
		else {
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -|");
			System.out.println();
			System.out.println("************          THANK YOU, VISIT AGAIN       *************");
			System.out.println();
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -|");
			
		}
	}
	public static void viewCart() {
		Scanner sc=new Scanner(System.in);

		if(b.size()>0) {
			System.out.printf("%-8s %-40s %-8s %-8s %-8s\n", "SI.No", "Item","Qty","Cost","Total");
			System.out.println();
			int j=1;
			for(int i=0;i<b.size();i++) {
				int t1=(int) b.get(i+1);
				int t2=(int) b.get(i+2);

				System.out.printf("%-8s %-40s %-8s %-8s %-8s\n",(j),b.get(i),b.get(i+1),b.get(i+2),(t1*t2));
				i++;
				i++;
				j++;
			}
			System.out.println();
			System.out.println("Do you want to remove from Cart? Y/N");
			char choice=sc.next().charAt(0);
			if(choice=='Y'||choice=='y') {
				System.out.println("\n");
				removeCart();
			}
			else if(choice=='N'||choice=='n'){
				Home.getHome();
			}
			else {
				System.out.println("\n\n");
				System.out.println("Enter the valid input");
				System.out.println();
				viewCart();
			}
		}
		else {
			System.out.println("0 item in the Cart");
			System.out.println();
			System.out.println(" your cart is empty..! plz buy something");
			Home.getHome();
		}

		System.out.println("\n"); 


	}

	public static void removeCart()
	{
		if(b.size()==0)
		{
			System.out.println("your cart is empty");
			Home.getHome();
			return;
		}
		int count=b.size()/3;
		Scanner sc=new Scanner(System.in);
		System.out.println("* Enter the SI.No of item to be removed");
		try {
			int choice=sc.nextInt();
			if(choice<=count&&choice>0) {
				choice=(choice-1)*3;
				b.remove(choice);
				b.remove(choice);
				b.remove(choice);
				System.out.println("Successfully removed");
				Home.getHome();
			}
			else {
				System.out.println("\n");
				System.out.println("Enter a valid input");
				System.out.println();
				System.out.println("Do you want to go to home page Y/N");
				char choice1=sc.next().charAt(0);
				if(choice1=='Y'||choice1=='y') 
				{
					System.out.println("\n");
					System.out.println(Qty +" Item Added to Cart");
					Home.getHome();
				}
				else if(choice1=='N'||choice1=='n')
				{
					removeCart();
				}
				Home.getHome();

			}
		}
		catch(InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter a valid input");
			System.out.println();
			removeCart();
		}
	}
}


