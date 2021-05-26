//4.       Please implement a function that accepts two string parameters say ‘Parameter1’ & ‘Parameter2’ and gives the output of the number of times the ‘Parameter1’ occurs in ‘Parameter2’
public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="Java is Programming Language Java asdf Java ghjhfj";
		String occurence="Java";
		
		int count=0;
		int fromIndex=0;
		
		while ((fromIndex = original.indexOf(occurence, fromIndex)) != -1 )
		{
			System.out.println("Fount at index: "+fromIndex);
			count++;
			fromIndex++;
		}
		System.out.println("Total number of occurence of Java: "+count);
	}

}
