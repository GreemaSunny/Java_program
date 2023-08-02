package basicpgm;

import java.util.Scanner;

public class Sumofevenandoddintegers {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int evensum=0,oddsum=0;
        int []ar=new int[size];
        System.out.println("Enter numbers");
        
        for(int i=0;i<size;i++) {
        	ar[i]=sc.nextInt();
        }

        for(int v:ar) {
        	if(v%2==0) {
        		evensum=evensum+v;
        	}else {
        		oddsum=oddsum+v;
        	}
        }System.out.println("Sum of even integers="+evensum);
        System.out.println("Sum of odd integers="+oddsum);
	}

}
