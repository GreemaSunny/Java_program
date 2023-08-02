package methodpgm;

public class Methodpgm1 {

	public static void main(String[] args) {
		Methodpgm1 ob=new Methodpgm1();
		ob.add(40,50);
		ob.div();
		int subtract=ob.sub(29,24);
		System.out.println("subtration="+subtract);
		int multiply=ob.mul();
		System.out.println("Multiplication="+multiply);
	}
//1.method without returntype and with parameter
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	
	//2.method without returntype and without parameter
	
	public void div()
	{
		int d1=30,d2=2,div;
		div=d1/d2;
		System.out.println(div);
		
	}
	
	//3.method with returntype and with parameter
	public int sub(int a,int b)
	{
		int su=a-b;
		return su;
	}
	
	//4.method with returntype and without parameter
	public int mul()
	{
		int a=20,b=34;
		int multi=a*b;
		return multi;
	}
}
