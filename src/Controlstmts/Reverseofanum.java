package Controlstmts;

public class Reverseofanum {

	public static void main(String[] args) {
		int a=345,R,s=0;
		while(a>0)
		{
			R=a%10; //5
			s=(s*10)+R;
			a=a/10;
			
		}System.out.print(s);
		
	}

}
