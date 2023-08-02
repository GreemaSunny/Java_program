package oops;

class Animal
{
	public void breed()
	{
		System.out.println("breed");
	}
}


class Dog extends Animal
{
	public void dogfood()
	{
		System.out.println("dogfood");
	}
}


class Babydog extends Dog
{
	public void dogsize()
	{
		System.out.println("dogsize");
	}
}


public class Multilevelinheritence {

	public static void main(String[] args) {
		Babydog ob=new Babydog();
		ob.breed();
		ob.dogfood();
		ob.dogsize();

	}

}
