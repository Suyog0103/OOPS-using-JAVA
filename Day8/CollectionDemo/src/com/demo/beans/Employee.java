package com.demo.beans;

public class Employee implements Comparable<Employee>{    //implemented comparable interface here which has compare to method(we overrided it)
	private int empid;
	private String ename;
	private String desg;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, String desg, double sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.desg = desg;
		this.sal = sal;
	}
	public Employee(int empid) {
		super();
		this.empid = empid;
		this.ename = null;
		this.desg = null;
		this.sal = 0;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + "]";
	}


	public boolean equals(Object ob) {
		System.out.println("in emplyee equals "+this.empid+"-----"+((Employee)ob).empid);
		return this.empid == ((Employee)ob).empid;  //ob downcasted and typecasted here
	}


	@Override
	public int compareTo(Employee o) {
		if (this.sal<o.sal) {
			return -1;
		}
		else if(this.sal==o.sal) {
			return 0;
		}
		else
			return 1;
		// return (int)(this.sal-o.sal);
		// System.out.println("in compare to  " +this.ename+(o.ename)); //this is done for my knowledge
		// return this.ename.compareTo(o.ename);  //strin.compareTo(string) is inbuilt function to compare strings
		
	}
	

}
