package oops;

public class Employeemethod {
	int empid;
	String empname;
	String designation;
	
	//using method
	public void empDetails(int empid,String empname,String designation)
	{
		this.empid=empid;
		this.empname=empname;
		this.designation=designation;
	}
	
	public void display()
	{
		System.out.println("empid=" +empid);
		System.out.println("empname=" +empname);
		System.out.println("empdesignation=" +designation);
	}
	public static void main(String[] args) {
		//object creation
		Employeemethod emp= new Employeemethod();
		emp.empDetails(101, "anu", "Tester");
		emp.display();
	}

}
