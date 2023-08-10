import java.util.*;


public class ArrayListDemo{
	
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		
		al.add("Nokia");
		
		al.add("Samsung");
		
		al.add(1);
		
		al.add(true);
		
		al.add('a');
		
		al.add(null);
		
		al.add("Samsung");
		
		al.add(null);
		
		System.out.println(al);
		
		System.out.println(" Values at 1 : "+ al.get(1));
		
		al.remove(2);
		
		System.out.println(al);
		
		al.remove(true);
		
		System.out.println(al);
		
		al.add(1,"Asus");
		
		System.out.println(al);
		
	}
	
	
}