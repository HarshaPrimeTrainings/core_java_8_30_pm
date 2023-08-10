import java.util.*;

public class VectorDemo{
	
		public static void main(String[] args){
			
		Vector vt = new Vector();
		
		vt.add("Nokia");
		
		vt.add("Samsung");
		
		vt.add(1);
		
		vt.add(true);
		
		vt.add('a');
		
		vt.add(null);
		
		vt.add("Samsung");
		
		vt.add(null);
		
		System.out.println(vt);
		
		System.out.println(" Vvtues at 1 : "+ vt.get(1));
		
		vt.remove(2);
		
		System.out.println(vt);
		
		vt.remove(true);
		
		System.out.println(vt);
		
		vt.add(1,"Asus");
		
		System.out.println(vt);
		
	}
	
}