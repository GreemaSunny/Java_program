package oops;

abstract class car{
	abstract public void carengine();
	public void averagespeed() {
		System.out.println("averagespeed");
	}
}

class Kia extends car{

	@Override
	public void carengine() {
		System.out.println("kia engine");
		
	}
}
class Maruti extends car{

	@Override
	public void carengine() {
		System.out.println("maruti engine");
		
	}
}


public class Abstractclass {

	public static void main(String[] args) {
		Kia ob=new Kia();
		ob.carengine();
		ob.averagespeed();
		
		Maruti ob1=new Maruti();
		ob1.averagespeed();
		ob1.carengine();
	}

}
