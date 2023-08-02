package oops;

import java.util.Scanner;

interface Animals{
	
	public void breed();
	public void breedprice();
	public void gender();
	public void colour();
}
 interface Birds{
	 public void breed();
	 public void price();
	 public void size();
	 public void colour();
 }

interface Petfood{
	
	public void foodprice();
}

interface Petaccessories {

	public void acceprice();
}

class Petshop1 implements Petaccessories,Petfood,Animals
{
	
	String price="RS.12000";
	String gender="Male";
	String colour="Black";
	String foodprice="Rs. 1000";
	String accesprice="Rs. 3000";
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void breed() {
		
		System.out.println("Enter the animal name");
		String aname=sc.next();
		
		System.out.println("Enter breed");
		String bname=sc.next();
		System.out.println("Animal= "+aname +" " +"breed= "+bname);
		
	}
	@Override
	public void breedprice() {
		System.out.println("price= "+price);
		
	}
	@Override
	public void gender() {
		System.out.println("gender= "+gender);
		
		
	}
	@Override
	public void colour() {
		System.out.println("colour= "+colour);
		
		
	}
	
	@Override
	public void foodprice() {
		System.out.println("Enter pet food");
		String pfood=sc.next();
		System.out.println("Petfood="+pfood+ "  "+"food price= "+foodprice);
		
	}
	
	@Override
	public void acceprice() {
		System.out.println("Enter pet accessory");
		String pacces=sc.next();
		System.out.println("Pet accessory="+pacces+"  "+ "price= "+accesprice);
		
	}
	
}

class Petshop2 implements Petaccessories,Petfood,Birds{
	String price="RS.8000";
	String size="small";
	String colour="Black";
	String foodprice="Rs. 500";
	String accesprice="Rs. 2000";
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void breed() {
		System.out.println("Enter bird name");
		String brname=sc.next();
		System.out.println("Bird= "+brname );
		
		System.out.println("Enter breed");
		String brename=sc.next();
		System.out.println("Bird= "+brname +" " +"breed= "+brename);
		
	}

	@Override
	public void price() {
		
		System.out.println("price= "+price);
	}

	@Override
	public void size() {
		System.out.println("size= "+size);
	}

	@Override
	public void colour() {
		System.out.println("colour= "+colour);
		
	}
	
	@Override
	public void foodprice() {
		System.out.println("Enter pet food");
		String pfood=sc.next();
		System.out.println("Petfood="+pfood+ "  "+"food price= "+foodprice);
		
	}

	@Override
	public void acceprice() {
		System.out.println("Enter pet accessory");
		String pacces=sc.next();
		System.out.println("Pet accessory="+pacces+"  "+ "price= "+accesprice);
		
	}
}
public class Petshoppgm {

	public static void main(String[] args) {
		
		/*Petshop1 ob=new Petshop1();
		ob.breed();
		ob.breedprice();
		ob.gender();
		ob.colour();
		ob.foodprice();
		ob.acceprice();*/
		
		Petshop2 ob1=new Petshop2();
		ob1.breed();
		ob1.price();
		ob1.size();
		ob1.colour();
		ob1.foodprice();
		ob1.acceprice();
	}

}
