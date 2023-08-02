package stringpgm1;

public class Stringq6 {

	public static void main(String[] args) {
		// Ques6
		String s1="java language is platform independent";
		String[] words= s1.split(" ");
		
		for(String w:words)
		{
			if(w.equals("platform"))
			{
				System.out.println("platform is present");
				break;
			}
		}
		
	}

}
