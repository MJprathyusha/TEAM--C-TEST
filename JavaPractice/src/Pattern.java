/*1. Can you print below diagram?

*

***

*****

********/
public class Pattern {

	public static void main(String[] args) {
		int n=7;
		// TODO Auto-generated method stub
		for(int i=0;i<=n;i=i+2)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}

	}

}
