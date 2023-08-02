package Controlstmts;

import java.util.Scanner;

public class Forloopmultitableofanynumber {

	public static void main(String[] args) {
		int R=0;
		System.out.println("Enter which multiplication table you want");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			R=i*num;
			System.out.println(i +"*"+num + "=" +R);
		}
	}

}
