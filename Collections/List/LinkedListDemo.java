import java.util.*;


public class LinkedListDemo{
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		
		ll.add("Nokia");
		
		ll.add("Samsung");
		
		ll.add(1);
		
		ll.add(true);
		
		ll.add('a');
		
		ll.add(null);
		
		ll.add("Samsung");
		
		ll.add(null);
		
		System.out.println(ll);
		
		System.out.println(" Vllues at 1 : "+ ll.get(1));
		
		ll.remove(2);
		
		System.out.println(ll);
		
		ll.remove(true);
		
		System.out.println(ll);
		
		ll.add(1,"Asus");
		
		System.out.println(ll);
		
	}
	
	
}