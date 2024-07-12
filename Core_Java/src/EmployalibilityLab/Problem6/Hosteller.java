package EmployalibilityLab.Problem6;

public class Hosteller extends Student {
	
	protected String hostelName;
	protected int roomNo;
	
	public Hosteller()
	{
		super();
	}
	public Hosteller(int id, String name1, int deptid,String name, int roomno)
	{
		super(id, name1,deptid);
		this.hostelName = name;
		this.roomNo = roomno;
	}
	public void settHostelname(String name)
	{
		this.hostelName = name;
	}
	public String getHostelname()
	{
		return hostelName;
	}
	public void setRoomno(int roomno)
	{
		this.roomNo = roomno;
	}
	public int getRoomno()
	{
		return roomNo;
	}
	
	
}
