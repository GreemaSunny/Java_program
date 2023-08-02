package oops;

class Member{
	String name;
	int age;
	long phonenumber;
	String address;
	int salary;
	
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phonenumber="+phonenumber);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
		
	}
}

class Employee extends Member{
	String specialisation;

}

class Manager extends Member{
	String department;
}


public class Inheritencepgm {

	public static void main(String[] args) {
		Employee ob=new Employee();
		ob.name="abc";
		ob.age=20;
		ob.phonenumber=27898909l;
		ob.address="qwerty";
		ob.salary=50000;
		ob.printdetails();
		System.out.println("specialisation= " +(ob.specialisation="java"));
		
		System.out.println();
		
		Manager ob1=new Manager();
		ob1.name="ash";
		ob1.age=21;
		ob1.phonenumber=78983909l;
		ob1.address="werty";
		ob1.salary=70000;
		System.out.println("department= "+ (ob1.department="HR"));
		ob1.printdetails();
		
	}

}
