package oops;

interface cal{
	public void add();
	public void sub();
	public void div();
}

interface calcop
{
	public void modulus();
}

class scientificcalc implements cal{

	@Override
	public void add() {
		System.out.println("add");
		
	}

	@Override
	public void sub() {
	System.out.println("sub");
	}

	@Override
	public void div() {
		System.out.println("div");
		
	}
	
}

class Normalcalc implements cal{

	@Override
	public void add() {
		System.out.println("normaladd");
		
	}

	@Override
	public void sub() {
		System.out.println("normalsub");
	}

	@Override
	public void div() {
		System.out.println("normaldiv");
	}
	
}


public class Interfacepgm {

	public static void main(String[] args) {
		cal ob=new scientificcalc();
		ob.add();
		ob.sub();
		ob=new Normalcalc();
		ob.add();
		ob.sub();
	}

}
