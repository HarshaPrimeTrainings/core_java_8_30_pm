
public class MainApp{
	
	public static void main(String[] args) {
	
		int age = Integer.parseInt(args[0]);
		
		if(age < 18){
			throw new AgeNotSuffecientException();
		}else{
			System.out.println("You are Eligible to spoin the country");
		}
		
	}
	
}