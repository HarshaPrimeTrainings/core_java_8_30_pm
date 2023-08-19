
import java.io.*;

public class SerializationDemo{
	
	public static void main(String[] args) throws IOException{
		
		
		
		FileOutputStream fos = new FileOutputStream("data.txt");
		
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		Customer c = new Customer();
		os.writeObject(c);
		os.close();
		System.out.println("Serialization Done");
	}
	
	
}