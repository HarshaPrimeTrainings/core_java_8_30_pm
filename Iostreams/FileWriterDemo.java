
import java.io.*;

public class FileWriterDemo{
	public static void main(String[] args) throws IOException{
		
		File f = new File("output.txt");
		FileWriter fr = new FileWriter(f);
		
		String s = "Hello How are you";
		
		char[] ch = s.toCharArray();
		fr.write(ch);
		
		System.out.println("Write COmpleted");
		
		fr.flush();
		fr.close();
		
		
	}
	
}