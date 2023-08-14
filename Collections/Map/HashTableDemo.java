import java.util.*;


public class HashTableDemo{
	
	
	public static void main(String[] args){
		
	Hashtable<String,Integer> m = new Hashtable<String,Integer>();	
	
	m.put("Books",20);
	m.put("Pens",30);
	m.put("Calculator",5);
	m.put("scalekit",5);
	m.put("Pens",50);
	
	Set keys = m.keySet();
	
	Iterator ir = keys.iterator();
	
	while(ir.hasNext()){
		String key = ir.next().toString();
		System.out.println(key + " : "+m.get(key));
	}
		
		
	}
	
	
}