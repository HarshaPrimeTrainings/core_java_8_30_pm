import java.util.*;

public class LinkedHashSetDemo{
	
	public static void main(String[] args){
		
		LinkedHashSet hs = new LinkedHashSet();
		
		hs.add("Nokia");
		hs.add("Samsung");
		hs.add("HTC");
		hs.add("Asus");
		hs.add("BlackBerry");
		hs.add("Sony");
		hs.add("Samsung");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		
		Iterator ir = hs.iterator();
		
		
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
	}
}