package stringpgm1;

import java.util.Scanner;

public class Stringq3 {

	public static void main(String[] args) {
		//Ques:3
		int count=0;
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a' ||a.charAt(i)=='e' ||a.charAt(i)=='i'||a.charAt(i)=='o' ||a.charAt(i)=='u')
			{
				count++;
			}
		}System.out.println("count of vowels= "+count);

	
	}
}
