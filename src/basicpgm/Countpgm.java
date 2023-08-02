package basicpgm;

import java.util.Scanner;

public class Countpgm {

	public static void main(String[] args) {
	int posscount=0,negcount=0,zerocount=0;
		System.out.println("Enter size");
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		
		int[] ar=new int[size];
		System.out.println("enter numbers");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int v:ar) {
			if(v>0) {
				posscount++;
			}else if(v==0) {
				zerocount++;
			}
				else {
					negcount++;
				}
		}System.out.println("count of possitive numbers= "+posscount+" "+"count of negative numbers= "+negcount+"  "+"count of zeros= "+zerocount);
	}

}
