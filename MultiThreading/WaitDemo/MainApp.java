public class MainApp{
	public static void main(String[] args) throws InterruptedException{
		Printer p = new Printer();
		
		
		new Thread(){
				@Override
				public void run(){
					
					p.printPages(20);
				}
		}.start();
		
		Thread.sleep(5000);
		
		new Thread(){
				@Override
				public void run(){
					
					p.insertPapers(10);
				}
		}.start();
		
	}
	
	
	
}

