package DAY3;

public class Player {
	private int pid;
	private String pname;
	private String skill;
	
	public Player()
	{
		this.pid=0;
		this.pname=null;
		this.skill=null;
	}

	public Player(int pid, String pname, String skill)
	{
		this.pid=pid;
		this.pname=pname;
		this.skill=skill;
	}
	
	public int getPid()
	{
		return this.pid;
	}
	
	public void setPid(int pid)
	{
		this.pid=pid;
	}
	
	public String getPname()
	{
		return this.pname;
	}
	
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	
	public String getSkill()
	{
		return this.skill;
	}
	
	public void setSkill(String skill)
	{
		this.skill=skill;
	}
	
	public String toString()
	{
		return "Pid: "+ pid + "\n Name: "+pname+ "\n skill: " +skill +"\n";
	}
}
