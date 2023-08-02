package oops;

import java.util.Scanner;

interface Bank{
	public void accountdetails();
	public void balance();
	public void deposit();
	public void withdraw();
}

class Sbi implements Bank{
	String name= "Greema";
	String bankname="Sbi";
	int balance=10000;
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void accountdetails() {
		System.out.println("Enter your Account Number");
		int accountno=sc.nextInt();
		
		System.out.println("Name="+name +"Account no:="+accountno +"Bank Name="+bankname);
	}

	@Override
	public void balance() {
		System.out.println("balance= "+balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter your deposit amount");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("deposit="+deposit +"/n" + "Your final deposit is "+balance);
	}

	@Override
	public void withdraw() {
		System.out.println("Enter your withdrawal amount");
		int withd=sc.nextInt();
		balance=balance-withd;
		System.out.println("Your balance amount is"+balance);
		
	}
	
}
public class Bankapp {

	public static void main(String[] args) {
		Sbi ob= new Sbi();
		ob.accountdetails();
		ob.balance();
		ob.deposit();
		ob.withdraw();
	}

}
