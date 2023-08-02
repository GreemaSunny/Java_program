package Controlstmts;

import java.util.Scanner;

public class ArrayIntegersum {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter size");
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		
		int[] ar=new int[size];
		System.out.println("enter numbers");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum=sum+ ar[i];
		}System.out.println("Sum= " +sum);
	}

}
