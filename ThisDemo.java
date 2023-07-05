
class ThisDemo{
	
	int a = 10;
	
	void display(){
		int a = 20;
		int b = 30;
		System.out.println(" a :: "+ a);
		System.out.println(" this.a :: "+ this.a);
		System.out.println(" b :: "+ b);
	}
	
	
	
	
	public static void main(String[] args){
		
		ThisDemo m = new ThisDemo();
		m.display();
		
		
	}
	
}