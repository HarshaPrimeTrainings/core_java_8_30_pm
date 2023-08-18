import java.io.*;

public class FIleReaderDemo{
	
public static void main(String[] args) throws IOException{
	
	File f = new File("demo.txt");
	
	FileReader fr  = new FileReader(f);
	
	int ch;
	while((ch = fr.read())!=-1){
		System.out.print((char)ch);
		
	}
	
	fr.close();
	
	
}
	
}