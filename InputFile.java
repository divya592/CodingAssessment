package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputFile {
	public static void main(String[] args) throws IOException {
		
		//Reading InputFile by using FileInputstream 
		FileInputStream r = new FileInputStream("C:\\FileProgram\\InputFile.txt");
		
		//Creating and Writing data in OutputFile by using OutputStream 
		FileOutputStream w = new FileOutputStream("C:\\FileProgram\\OutputFile.txt");
		
		int i;
		while((i=r.read())!=-1)
		{
			w.write((char)i);
			
		}
		System.out.println("Data Copied Sucessfully.");
		System.out.println(" ");
		System.out.println("Check the FileProgram folder in your C drive, OutputFile is created containing InputFile data..!!!");
	}

}
