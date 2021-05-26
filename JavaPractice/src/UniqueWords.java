//11.   Given a string print the unique words of the string

import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		str=sc.nextLine();
		String words[]=str.split(" ");
		
		int count=0;
	    for(int i=0;i<words.length;i++)
	    {  if(words[i].equals("") || words[i].equals(" "))
	          {                      
	            continue; 
	          }
	       else {                  
	              for(int j=i+1;j<words.length;j++)
	              {
	                if(words[i].equals(words[j]))
	                 { 
	                   count=1;
	                   words[j]=" ";
	                   break;
	                 }
	              }
	              if(count==0)
	              {
	               System.out.print(words[i]+" ");
	              }
	              count=0;     
	            }
	    }
		
	}

}
