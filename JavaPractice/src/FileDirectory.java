//3.       Three Ways of specifying file directories

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FileDirectory {

	public static void main(String[] args)throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Java_file\\text_file\\test.txt");
		printPaths(file);
		// relative path
		file = new File("test.xsd");
		printPaths(file);
		// complex relative paths
		file = new File("C:\\\\Java_file\\\\text_file\\\\test.txt");
		printPaths(file);
		// URI paths
		
	}

	private static void printPaths(File file) throws IOException {
		System.out.println("Absolute Path: " + file.getAbsolutePath());//from the root element located in the system
		System.out.println("Canonical Path: " + file.getCanonicalPath());//unique method
		System.out.println("Path: " + file.getPath());//exactly that file
	}
	}


