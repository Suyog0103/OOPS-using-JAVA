package DAY3;

public class Team {
	private int tid;
	private String tname;
	private Player captain;
	private Player[] plist;
	
	public Team()
	{
		tid=0;
		tname=null;
		captain=null;
		plist=null;
	}
	
	public Team(int tid, String tname, Player captain, Player[] plist)
	{
		this.tid=tid;
		this.tname=tname;
		this.captain=captain;
		this.plist=plist;
	}
	
	public int getTid()
	{
		return tid;
	}

	public void setTid(int tid)
	{
		this.tid=tid;
	}
	
	public String getTname()
	{
		return tname;
	}

	public void setTname(String tname)
	{
		this.tname=tname;
	}

	public Player getCaptain()
	{
		return captain;
	}

	public void setCaptain(Player captain)
	{
		this.captain=captain;
	}
	
	public Player[] getPlist()
	{
		return plist;
	}

	public void setPlist(Player [] plist)
	{
		this.plist=plist;
	}
	
	public String toString()
	{
		String str="";
		for(int i=0; i<this.plist.length; i++)
		{
			str+=plist[i];
		}
		return "Team Id: " +tid+ "Team: " +tname+ "Captain INfo: " +captain+ "Players: "+ str;
	}
}
