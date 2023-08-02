package oops;


class Parent
{
	public void add()
	{
	System.out.println("add");
}
}

class Child extends Parent
{
	public void sub()
	{
		System.out.println("sub");
	}
}

public class Singlelevelinheritence {

	public static void main(String[] args) {
		
Child ob=new Child();
ob.add();
ob.sub();
	}

}
