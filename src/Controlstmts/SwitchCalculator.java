package Controlstmts;

public class SwitchCalculator {

	public static void main(String[] args) {
		
		int a=324,b=-52;
		char choice='+';
		double result=0;
		switch(choice)
		{
		case '+':result=a+b;
		break;
		case '-':result=a-b;
		break;
		case '*':result=a*b;
		break;
		case 'D':if(b==0)
		{
			System.out.println("error");
		}else
		{
			result=a/b;
		break;
		}
		default:System.out.println("Invalid Choice");
		}System.out.println (result);
	}

}
