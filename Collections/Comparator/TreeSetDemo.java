import java.util.*;

public class TreeSetDemo{
	
	public static void main(String[] args){
		
		TreeSet hs = new TreeSet();
		
		Product prd3 = new Product(3,"pen",5);
		Product prd1 = new Product(1,"Book",20);
		Product prd4 = new Product(4,"Laptop",5200);
		Product prd2 = new Product(2,"Mobile",500);
		
		hs.add(prd1);
		hs.add(prd2);
		hs.add(prd3);
		hs.add(prd4);
		
		Iterator ir = hs.iterator();
		
		while(ir.hasNext()){
			Product item = (Product)ir.next();
			item.getProductDetails();
		}
		
		
		
		
	}
}