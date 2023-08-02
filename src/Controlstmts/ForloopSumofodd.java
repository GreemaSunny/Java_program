package Controlstmts;

public class ForloopSumofodd {

	public static void main(String[] args) {
		int sum=0,n=10,S=0;
		// USING IF--else
		
			if(n%2==0)
			{
			sum=n*n/4;
			System.out.println(sum);
			}else
			{
				sum=(n+1)*(n+1)/4;
				System.out.println(sum);
			}
		// USING FOR LOOP
			for(int i=1;i<=n;i++)
			{
				if(i%2!=0)
				{
					S=S+i;
				}
			}System.out.println(S);
	}

}
