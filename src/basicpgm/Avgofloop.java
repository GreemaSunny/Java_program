package basicpgm;

import java.util.Scanner;

public class Avgofloop {

	public static void main(String[] args) {
		
		int sum=0;
		int[]ar=new int[10];
		System.out.println("Enter 10 numbers");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			ar[i]=sc.nextInt();
		}
		
		for(int i=0;i<10;i++)
		{
			sum=sum+ ar[i];
		}
		System.out.println("Average= "+(sum/10));
	}

}
