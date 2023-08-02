package oops;

import java.util.Scanner;

public class Palliandrome {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int s=0,R;
		while(n>0)
		{
			R=n%10; 
			s=(s*10)+R;
			n=n/10;
			
		}
if(s==temp) {
	System.out.println("Number is a palliandrome");
}else
{
	System.out.println("Number is not a palliandrome");
}
	}

}
