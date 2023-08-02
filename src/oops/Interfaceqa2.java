package oops;

interface Smarttvremote{
	public void smartremote();
}

interface Tvremote extends Smarttvremote{
	public void tvremote();
}

class Tv implements Tvremote{

	@Override
	public void smartremote() {
		System.out.println("smart Remote");
		
	}

	@Override
	public void tvremote() {
		System.out.println("Tv remote");
	}
	
}
public class Interfaceqa2 {

	public static void main(String[] args) {
		Tv ob=new Tv();
		ob.smartremote();
		ob.tvremote();
	}

}
