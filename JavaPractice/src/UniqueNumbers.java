
public class UniqueNumbers {

	 static void printUnique(int arr[]) {

	  int length = arr.length;
	  
	  System.out.print("Printing unique number from array are: ");
	  for (int i = 0; i < length; i++) {
	 
	   int j;
	   for (j = 0; j < i; j++)
	    if (arr[i] == arr[j])
	     break;

	   if (i == j)
	    System.out.print(arr[i] + " ");

	  }
	 }

	 
	 public static void main(String[] args) {
	  int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 2, 4, 6, 8 };
	  printUnique(arr);

	 }
}
