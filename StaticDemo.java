class StaticDemo{
	
	static String msg1 = " Hello Iam Static";
	
	
	
	
	void mymethod(){
		System.out.println("Non - Static Method" + msg1);
	}
	
	void mymethod1(){
		msg1 = " value changed";
		System.out.println("Non - Static Method" + msg1);
	}
	
	public static void main(String[] args){
		
		StaticDemo m = new StaticDemo();
		
		m.mymethod();
		m.mymethod1();
		
	}
	
}