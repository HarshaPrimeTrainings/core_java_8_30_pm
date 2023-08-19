
import java.io.*;

public class DeSerializationDemo{
	
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		
		
		FileInputStream fis = new FileInputStream("data.txt");
		
		ObjectInputStream oi = new ObjectInputStream(fis);
			
			Object obj = oi.readObject();
			Customer c = (Customer)obj;
			c.getCustomerDetails();
			oi.close();
		
		
		
	}
	
	
}