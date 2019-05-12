import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class WelcomePage {

	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("*************** SHOPING ADDA.COM ***************"+"\n");
		Date dNow = new Date();
		SimpleDateFormat ft= new  SimpleDateFormat("E yyyy.MM.dd     'Time:' hh:mm:ss a zzz");
		System.out.println(" Date:"+ft.format(dNow) );
		System.out.println("************************************************");
		Scanner scn = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter your name: ");
		String name=scn.nextLine();
		while(!name.matches("[a-zA-Z]+"))
		{
			System.out.println("Invalid Entry!! Retype your name..");
			name=scn.nextLine();
		}

		System.out.println("\n");
		System.out.print("Enter your phone number(10digit):+91  ");
		Scanner scan =new Scanner(System.in);
		String num=scan.nextLine();

		while(!num.matches("[0-9]{10}"))
		{
			System.out.println("Invalid number!! Re enter your number..");
			num=scan.nextLine();

		}
		System.out.println("\n");

		System.out.println("	      **WELCOME :"+" "+ name+" " +"**");


		Home.getHome();
	}
}