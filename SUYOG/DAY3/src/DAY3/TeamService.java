package DAY3;
import java.util.Scanner;

public class TeamService {
	private static Team [] t;
	static int count;
	static {
		t= new Team[10];
		Player cp = new Player(1, "Suyog", "All Rounder");
		Player [] arr = new Player[2];
		Player p1 = new Player(1, "Piyush", "batsman");
		Player p2 = new Player(2, "Pratik", "bowler");
		arr[0]= p1;
		arr[1]=p2;
		//Player p3 [] = {new Player(1, "Piyush", "batsman"), new Player(2, "Pratik", "bowler")};  //this also allowed
		Team t1 = new Team(1, "Squirtle", cp, arr);
		t[0]= t1;
		count = 2;
	}
	
	public static void addTeam()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team id");
		int tid= sc.nextInt();
		System.out.println("Enter Team name");
		String tnaem= sc.next();
		System.out.println("Enter captain id");
		int cid= sc.nextInt();
		System.out.println("Enter captain name");
		String cname= sc.next();
		System.out.println("Enter captain's skill");
		String cskill= sc.next();
		Player cp=new Player(cid, cname, cskill);
		
	
	}

}
