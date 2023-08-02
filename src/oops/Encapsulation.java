package oops;


class Emp
{
	private String name;
	private int sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Emp ob=new Emp();
		ob.setName("Greema");
		ob.setSal(10000);
		System.out.println(ob.getName());
		System.out.println(ob.getSal());
	}

}
