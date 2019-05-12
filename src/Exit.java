import java.util.Scanner;

public class Exit {
	public static void getExit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to exit? Y/N ");
		char choice=sc.next().charAt(0);
		if(choice=='Y'||choice=='y') {
			Cart.ext();
			return;
		}
		else if(choice=='N'||choice=='n'){
			Home.getHome();
		}
		else {
			System.out.println("Enter the valid input");
			System.out.println("\n");
			getExit();
		}

	}

}
