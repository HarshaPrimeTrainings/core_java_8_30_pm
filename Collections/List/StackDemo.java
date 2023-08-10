import java.util.*;


public class StackDemo{
	
	public static void main(String[] args){
		Stack s = new Stack();
		
		s.push("Nokia");
		s.push("Samsung");
		s.push("Asus");
		s.push("HTC");
		s.push("Apple");
		
		System.out.println(s);
		
		System.out.println("POP :: "+ s.pop());
		System.out.println("After pop : "+ s);
		
		System.out.println("PEEK :: " + s.peek());
		System.out.println("After peek : "+ s);
		
		
	}
	
	
}