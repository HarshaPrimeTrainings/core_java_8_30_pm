
import java.io.*;

public class Customer implements Serializable{
	
	int custId = 123;
	String custname = "Harsha";
	transient int pin = 1122;
	
	void getCustomerDetails(){
		System.out.println(custId + " :: " + custname + " :: "+ pin);
	}
	
	
}