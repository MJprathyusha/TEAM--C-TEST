//13.   Read a file content and write it to a new file in reverse order. (reverse line 1-10 to line 10-1)

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReverse {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
			FileInputStream fstream = new FileInputStream("C:\\Java_file\\text_file\\test.txt");
			DataInputStream in = new DataInputStream(fstream);
			 BufferedReader br = new BufferedReader(new InputStreamReader(in));
			 String strLine;
			
				try {
					while((strLine= br.readLine()) != null)
					{
						System.out.println(strLine);
						StringBuilder build=new StringBuilder(strLine);
						System.out.println("Reversed of the file content is: "+build.reverse().toString());
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			 
			 

			

	

}
