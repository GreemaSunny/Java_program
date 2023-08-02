package oops;

class Monkey{
	public void jump() {
		System.out.println("Jump");
	}
	public void bite() {
		System.out.println("bite");
	}
}

 interface Basicanimal{
	 public void eat();
	 public void sleep();
 }

class Human extends Monkey implements Basicanimal{

	public void speak() {
		System.out.println("Humanspeak");
	}

@Override
	public void eat() {
		System.out.println("Human eat");
	}

	@Override
	public void sleep() {
		System.out.println("Human sleep");
		
	}

	
}
public class Interfacepgmqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human ob=new Human();
		ob.bite();
		ob.eat();
		ob.jump();
		ob.sleep();
		ob.speak();
	}
}


