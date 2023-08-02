package basicpgm;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		boolean flag=false;
		System.out.println("enter a possitive integer");
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        	for(int i=2;i<num/2;i++) {
        		//condition for non prime
        		if(num%i==0) {
        			flag=true;
        			break;
        		   }     	
        	    }
        	
        if(!flag){
        	System.out.println(num +" is a prime number");
        }else 
        {
        System.out.println(num +" is not a prime number");
	     }
   }
}
