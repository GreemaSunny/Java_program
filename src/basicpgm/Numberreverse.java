package basicpgm;

import java.util.Scanner;

public class Numberreverse {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int s=0,r;
    
        while(num>0){
    	 r=num%10;
         s=s*10+r;
         num=num/10;
     } System.out.println("Reversed number= "+s);
	
	}
}
