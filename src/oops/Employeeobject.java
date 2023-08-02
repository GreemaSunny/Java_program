package oops;

public class Employeeobject {
	int empid;
	String empname;
	String designation;
	
	public void display()
	{
		System.out.println("empid=" +empid);
		System.out.println("empname=" +empname);
		System.out.println("empdesignation=" +designation);
	}
//using object -- intialising value to the class variables
	public static void main(String[] args) {
		Employeeobject emp1=new Employeeobject();
		emp1.empid=101;
		emp1.empname="Dev";
		emp1.designation="Developer";
		emp1.display();
		
	}

}
