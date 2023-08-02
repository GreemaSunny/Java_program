package Controlstmts;

import java.util.Scanner;

public class ScannerCalculator {

	public static void main(String[] args) {
		System.out.println("Enter two number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter your choice");
		System.out.println("1.add, 2. sub, 3. multiplication, 4. division");
		int c=sc.nextInt();
		
		double result=0;
		switch(c)
		{
		case 1:result=a+b;
		break;
		case 2:result=a-b;
		break;
		case 3:result=a*b;
		break;
		case 4:if(b==0)
		{
			System.out.println("error");
		}else
		{
			result=a/b;
		break;
		}
		default:System.out.println("Invalid Choice");
		}System.out.println (result);
	}

}
