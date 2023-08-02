package basicpgm;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		
//		System.out.println("Enter the number of terms in the fibonacci series");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//	    int firstterm=0,secondterm=1;
//	    
//	    System.out.println("fibonacci series of "+n+ " terms is ");
//	    
//		for(int i=1;i<=n;i++) {
//			
//		System.out.print(firstterm +"  ");
//		int nextterm=firstterm+secondterm;
//		firstterm=secondterm;
//		secondterm=nextterm;
//	}
		int n1=0,n2=1,n3,count=10;
		System.out.print(n1+" "+n2);

		for(int i=2;i<count;i++){
		n3=n1+n2;
		System.out.print(" "+n3+" ");
		n1=n2;
		n2=n3;

	}
	}
}
