package DAY3;
import java.util.Scanner;

public class TeamFunction {
	public static void main(String [] s)
	{
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter Choice \n");
			System.out.println("1. Add Team\n"
							+ "2. Display Team\n"
							+ "3. Search by captain\n"
							+ "4. Search by skill\n"
							+ "5. Exit");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					TeamService.addTeam();
					break;
				
				case 2:
					TeamService.displayTeam();
					break;
				
				case 3:
					TeamService.searchByCaptain();
					break;
				
				case 4:
					TeamService.searchBySkill();
					break;
				
				case 5:
					sc.close();
					System.out.println("Thank you for visiting!!!!");
					break;
					
				default:
					System.out.println("Entered Wrong Choice");
					break;
			}
		}while(choice!=5);
	}

}
