package exam;

import java.util.Scanner;

public class Countofcharacters {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		
		for(int i=0;i<a.length();i++)
			{
				char c= a.charAt(i);
				if( c!=' ' )
				{
					count++;
					
				}
			}
		System.out.println("count of String= "+count);
		

	}

}
