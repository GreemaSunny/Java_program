package Controlstmts;

public class NestedforloopStarreverse {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>0;i--)
		{
		for(int j=i;j>0;j--)
		{
			System.out.print("* ");
		}
			
		System.out.println();				
		}
	}
}
/*j= 5 4 3 2 1   for  i=5
  j= 4 3 2 1          i=4
  j= 3 2 1            i=3
  j= 2 1              i=2
  j= 1                i=1    */