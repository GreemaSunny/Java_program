package oops;

public class Polymorphism {

	public static void main(String[] args) {
		Polymorphism ob=new Polymorphism();
		ob.add(20, 30);
		ob.add(24, 34.91);
		ob.add(20, 40, 50);
		ob.add(34.15, 86);

	}
	
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
  //1.by changing the number of parameters
	public void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
	//2.by changing the datatype of arguments
	public void add(int a, double b) {
		double sum=a+b;
		System.out.println(sum);
	}
	
	//3.by changing the order of parameters of methods
	public void add(double a, int b) {
		double sum=a+b;
		System.out.println(sum);
	}
}

