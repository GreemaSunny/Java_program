package stringpgm1;

public class Stringq1and2 {

	public static void main(String[] args) {	
   // Ques:1
	String s="Java";
	String s1="language";
	System.out.println(s.concat(s1));
	
	//Ques:2
	String s2="java language is platform independent";
	if(s2.contains("platform"))
	{
		System.out.println("PASS");
	}else
	{
		System.out.println("FAIL");
	}
	
	
	}

}
