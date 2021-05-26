//6.       Given an array of integers, print only odd numbers.
public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,4,99,56};
		System.out.println("Even numbers are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
