import java.util.*;


public class IteratorDemo{
	
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		
		al.add("nokia");
		al.add("samsung");
		al.add("asus");
		al.add("sony");
		al.add("blackberry");
		
		System.out.println(" :: ==For Loop=== :: ");
		for(int i=0;i<al.size();i++){
			String temp = al.get(i).toString().toUpperCase();
			System.out.println(temp);
		}
		System.out.println(" :: ==For Each=== :: ");
		for(Object item:al){
			String temp = item.toString().toUpperCase();
			System.out.println(temp);
		}
		
		Iterator ir = al.iterator();
		
		System.out.println(" :: ===Iterator == :: ");
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		
	}
	
	
}