package EmployalibilityLab.Problem6;

public class Student {
	
	protected int studid;
	protected String name;
	protected int deptid;
	
	public Student()
	{
		super();
	}
	public Student(int id, String name, int deptid)
	{
		this.studid = id;
		this.name = name;
		this.deptid = deptid;
	}
	public int getStudid() 
	{
		return studid;
	}
	public void setStudid(int studid) 
	{
		this.studid = studid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getDeptid() 
	{
		return deptid;
	}
	public void setDeptid(int deptid) 
	{
		this.deptid = deptid;
	}
}
