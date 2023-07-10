class MainApp extends Greet{
	
	String msg = "MainApp Secret";
	
	public void display(){
		String msg = "Local Secret";
		System.out.println("Local Variable of MainApp : "+ msg);
		System.out.println("Instance Variable of MainApp class: "+ this.msg);
		System.out.println("Instance Variable of Greet class: "+ super.msg);
	}
	
	public static void main(String[] args){
		
		MainApp m = new MainApp();
		
		m.display();

	}
	
}