package oops;

class Animaldetails{
	public void sleep()
	{
   System.out.println("Sleep");
	}
}

class Tiger extends Animaldetails{
	public void tigerdetails()
	{
   System.out.println("tigerdetails");
	}
}

class Lion extends Animaldetails{
	public void liondetails()
	{
   System.out.println("Liondetails");
	}
}

public class Hierarchialinheritence {

	public static void main(String[] args) {
		Tiger ti=new Tiger();
		ti.tigerdetails();
		ti.sleep();
		
            Lion li=new Lion();
            li.liondetails();
            li.sleep();
	}

}
