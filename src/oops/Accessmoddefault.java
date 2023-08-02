package oops;

class Par
{
	String name;
}

public class Accessmoddefault {
protected int sal=10000;
	public static void main(String[] args) {
		Par ob=new Par();
		ob.name="abc";
		Accessmoddefault ob1=new Accessmoddefault();
		System.out.println(ob1.sal);
}
}