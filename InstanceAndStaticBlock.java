class InstanceAndStaticBlock {
	
	{
		System.out.println("Instance Block");
		
	}
	
	static{
		System.out.println("Static Block");
	}
	
	
	
	public static void main(String[] args){
		System.out.println("Main Method");
		new InstanceAndStaticBlock();
		
		
	}
	
}