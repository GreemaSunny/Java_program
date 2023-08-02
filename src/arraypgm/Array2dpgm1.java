package arraypgm;

import java.util.Scanner;

public class Array2dpgm1 {

	public static void main(String[] args) {
		int[][] a=new int[3][2];
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("entered values are: ");
	/*	for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j] +" " );
			}System.out.println();
		} */
     for(int []v:a)
     {
    	 for(int v2:v)
    	 {
    		 System.out.print(v2 +" ");
    	 }System.out.println();
     }
	}

}
