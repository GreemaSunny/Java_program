package oops;

class Parent1{
	public void phone()
	{
		System.out.println("samsung");
	}
	public void job()
	{
		System.out.println("Developer");
	}
}

class Child1 extends Parent1
{

	@Override
	public void phone() {
		System.out.println("iphone");
		super.phone();
	}

	@Override
	public void job() {
		System.out.println("Tester");
		super.job();
	}
	
	
}
public class Methodoverridding {

	public static void main(String[] args) {
		Child1 ob=new Child1();
		ob.job();
		ob.phone();

	}

}
