package exam;

public class Rearrange {

	public static void main(String[] args) {
		String s="Ielts training details";
		String[]ar=s.split(" ");
		
		for(int i=(ar.length-1);i>=0;i--) {
			System.out.print(ar[i]+" ");
		}

	}

}
