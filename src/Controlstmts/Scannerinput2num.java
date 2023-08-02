package Controlstmts;

import java.util.Scanner;

public class Scannerinput2num {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int R=a+b;
		System.out.println(R);
	}

}
