class Calculator{
	
	void addtion(int a, int b){
		int c = a+b;
		System.out.println("Addition of "+ a + " & "+ b+ " : "+ c);
	}
	
	public static void main(String[] args){
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		Calculator calc = new Calculator();
		
		calc.addtion(num1,num2);
	}
	
}