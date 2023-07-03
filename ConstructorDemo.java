class ConstructorDemo{
	
	ConstructorDemo(){
		System.out.println("Non-Argument Constructor : ");
	}
	
	ConstructorDemo(int roll){
		System.out.println("Argument Constructor : " + roll );
	}
	
	ConstructorDemo(int roll, String name){
		System.out.println("Argument Constructor : " + roll + " :: "+ name);
	}
	
	public static void main(String[] args){
		ConstructorDemo s = new ConstructorDemo();
		ConstructorDemo s1 = new ConstructorDemo(1);
		ConstructorDemo s2 = new ConstructorDemo(2,"demouser");
		
		
	}
	
	
}
