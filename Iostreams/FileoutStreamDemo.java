
import java.io.*;


public class FileoutStreamDemo{
	
public static void main(String[] args) throws IOException{
	
FileInputStream fis = new FileInputStream("demo.txt");

FileOutputStream fos = new FileOutputStream("output.txt");

	int ch;
		
		while((ch = fis.read())!=-1){
			fos.write(ch);
		}
		System.out.print("File write Complete");
		
		
		fos.flush();
		
		fis.close();
		fos.close();

}
	
	
}