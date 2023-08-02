package oops;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) //throws FileNotFoundException
	{
		
		
	//	FileInputStream f=new FileInputStream("e://Book1.xlsx");
		
		
		
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e){
		System.out.println(e.getMessage());	
		System.out.println("arithmetic exception");
		}

try {
	int ar[]= new int[2];
	
	ar[0]=20;
	ar[1]=50;
	ar[2]=79;
	System.out.println(ar[2]);
}
catch(Exception e) {
	System.out.println("Arrayindexboundexception");
	System.out.println(e.getMessage());
}
		
	try {
	String s=null;
	System.out.println(s.length());
	}
	catch(Exception e){
		System.out.println(e.getMessage());
		System.out.println("nullpointexception");
	}
	System.out.println("Next");
	}

}
