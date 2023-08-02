package stringpgm1;

public class Stringpgm1 {

	public static void main(String[] args) {
		String a=" hello ";
		String a1=" hello world ";
		String b="welcome";
		String b1="WelcomE";
		String s1="Welcome to Luminar";
		
		//concate
		System.out.println(a.concat(b));// hello welcome
		System.out.println(a.concat("ball"));
		System.out.println(1+2+a+3+2);//3 hello 32
		
		//equals
		System.out.println(a.equals(b));//false
		System.out.println(b.equals(b1));//false
		System.out.println(b.equalsIgnoreCase(b1));//true
		
		//contains
		System.out.println(s1.contains("Luminar"));//true
		
		//lowercase and uppercase
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());

		//chartAt()
		System.out.println(a.charAt(5));
		
		//length
		System.out.println(a.length());

		//startswith and endswith
		System.out.println(s1.startsWith("Welcome"));
		System.out.println(s1.endsWith("Luminar"));

		//trim
		System.out.println(a1.trim());
		
		//tocharArray()
		char[] c=s1.toCharArray();
		for(char v:c)
		{
			System.out.println(v);
		}
		
		//split
		String[] words= s1.split(" ");
		for(String w:words)
		{
			System.out.println(w);
		}
		
		//substring
		System.out.println(s1.substring(0,3));
		
		//escape sequence
		System.out.println("She is smart\'she is hardworking");
	}

}
