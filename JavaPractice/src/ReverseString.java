//12.   Given a string print the reverse of the string.

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="Poornakala";
		StringBuilder reverseOutput=new StringBuilder();
		
		
		reverseOutput.append(original);
		reverseOutput.reverse();
		System.out.println("Reverse of the given string is: "+reverseOutput);
		
	}

}
