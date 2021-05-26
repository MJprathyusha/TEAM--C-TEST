//10.   Given an array of integers check the Palindrome of the series

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;    
		  int n=121; 
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("The given integer is palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
	}


