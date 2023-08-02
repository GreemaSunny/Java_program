package Controlstmts;

import java.util.Scanner;

public class Arraypgm2 {

	public static void main(String[] args) {
		int[] ar=new int[3];
		System.out.println("Enter 3 numbers");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		/*for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}
		*/
		for (int v:ar)
		{
			System.out.println(v);
		}

	}

}
