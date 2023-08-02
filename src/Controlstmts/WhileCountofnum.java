package Controlstmts;

public class WhileCountofnum {

	public static void main(String[] args) {
		int a=5789,count=0;
		while(a>0)
		{
		a=a/10;
		count++;
		}System.out.println("count="+count);
	}

}
/*5789/10=578---count=1
578/10=57---count=2
57/10=5...count=3
5/10=0-----count=4
0 not less than 0 (check a<0 condition)  so exit  */