package methodpgm;

import java.util.Scanner;

public class Areaofshapes {

	public static void main(String[] args) {
Areaofshapes ob= new Areaofshapes();

//circle
System.out.println("Enter radius ");
Scanner sc=new Scanner (System.in);
int r=sc.nextInt();
ob.circleArea(r);

//rectangle
ob.rectArea();

//square
System.out.println("Enter side of the square ");
int a=sc.nextInt();
int sarea=ob.sqaArea(a);
System.out.println("Area of square= "+sarea);

//triangle
System.out.println("Enter base and height of the triangle ");
double tarea=ob.triArea();
System.out.println("Area of triangle= "+tarea);
	}
	
	// circle
public void circleArea(int r)
{
	double area=3.14*r*r;
	System.out.println("Area of circle= "+area);
}

//rectangle
public void rectArea()
{
	System.out.println("Enter Length and Breadth of the rectangle ");
	Scanner rec=new Scanner (System.in);
	int L=rec.nextInt();
	int B=rec.nextInt();
	int area=L*B;
	System.out.println("Area of rectangle= "+area);
}

// Square
public int sqaArea(int a)
{
	
	int area=a*a;
	return area;
	
}
//triangle
public double triArea()
{
	
	Scanner tri=new Scanner (System.in);
	int b=tri.nextInt();
	int h=tri.nextInt();
	double area=0.5*b*h;
	return area;
}

}
