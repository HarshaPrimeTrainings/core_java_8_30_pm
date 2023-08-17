import java.io.*;


public class FIleInputStreamDemo{
	
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("demo.txt");
		
		BufferedInputStream bis = new  BufferedInputStream(fis);
		
		int ch;
		
		while((ch = bis.read())!=-1){
			System.out.print((char)ch);
		}
		
		
		bis.close();
		
		
	}
	
	
	
	
	
}