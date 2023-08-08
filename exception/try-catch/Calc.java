public class Calc{
	
	public static void main(String[] args){
		
		int a = Integer.parseInt(args[0]);
		
		int b = Integer.parseInt(args[1]);
		
		
		System.out.println(" ::: Welcome to Calculator APP :::");
		
		try{
		int res = a/b;
		System.out.println("Result of "+ a + "/"+ b + " :: "+ res);
		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
			
			
		}
		
		System.out.println(" ::: Hello There! :::");
		
		System.out.println(" ::: Demo Statmement1 ! :::");
		
		System.out.println(" ::: Demo Statmement2 ! :::");
		
	}
	
	
	
}