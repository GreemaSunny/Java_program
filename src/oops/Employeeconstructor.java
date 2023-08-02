package oops;

public class Employeeconstructor {
	int empid;
	String empname;
	String designation;
	
	public Employeeconstructor(int empid,String empname,String designation)
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
		Employeeconstructor emp= new Employeeconstructor(101,"Anu","Tester");
		emp.display();
		Accessmoddefault ob1=new Accessmoddefault();
		System.out.println(ob1.sal);
		Par ob=new Par();
		System.out.println(ob.name="abc");
	}

}
