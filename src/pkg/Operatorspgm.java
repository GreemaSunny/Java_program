package pkg;

public class Operatorspgm {

	public static void main(String[] args) {
		
		// Arithmetic Operators
		
		int a=60,b=40;
		System.out.println("a+b= "+(a+b)); //100
		System.out.println("a-b= "+(a-b)); //20
		System.out.println("a*b= "+(a*b)); //2400
		System.out.println("a/b= "+(a/b)); //1- division-quotient
		System.out.println("a%b= "+(a%b)); //20- modulus-remainder
		
		// Assignment Operators
		
		int c=35,d=15;
		System.out.println(c+=d); //c=c+d 50
		System.out.println(c-=d); //c=c-d value of c is updated to (50-15=) 35
		System.out.println("value of c*=d= "+(c*=d)); //(35*15=)525
		System.out.println(c/=d); //c=c/d --value of c is updated to(525/15=) 35
		
		//Relational Operators
		System.out.println(a<b); //False
		System.out.println(a>b); //True
		System.out.println(a<=b); //False
		System.out.println(a>=b); //True
		System.out.println(a==b); //False
		System.out.println(a!=b); //True
		
		System.out.println("value of a= "+a + "value ofb= "+b); //a=60,b=40
		
		System.out.println(a=a+b); //100
		System.out.println(a); //value of a updated to 1000
		
		//Logical Operators
		String username="abc";
		String password="abc123";
		System.out.println(username=="abc" && password=="abc123");//True
		System.out.println(username=="abc" || password=="abc1");//True
		System.out.println(!(username=="abc"));//False
		
		//Unary Operators(++ , --)
		int v=20;
		System.out.println(v++); //20 printed and then +1 increment is done
		System.out.println(v);   //21 incremented value of v is printed
		System.out.println(++v); //22 v is incremented by 1 and then updated value of v is printed
	}
	

}
