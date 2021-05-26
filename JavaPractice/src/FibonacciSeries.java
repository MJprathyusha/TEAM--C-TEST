//9.       Given an array of integers check the Fibonacci series.

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int length=sc.nextInt();

		int a=0,b=1,sum= 0;
		
		for(int i=0;i<=length;++i)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println("Sum of the numbers are: "+sum);
		}
		
		
	}

}
