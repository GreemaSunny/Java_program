package oops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("enter a 3-digit number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int s=0,R;
		while(n>0)
		{
			R=n%10; 
			s=s+R*R*R;
			n=n/10;
		}
		
		if(s==temp) {
			System.out.println("Number is an armstrong");
		}else
		{
			System.out.println("Number is not an armstrong");
		}
}
}