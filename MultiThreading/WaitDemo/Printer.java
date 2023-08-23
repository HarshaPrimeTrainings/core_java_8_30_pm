public class Printer{
	int pages = 10;
	
	
	public synchronized void printPages(int nofPages){
		
		System.out.println("Print Started");
		System.out.println("Pages inside the Printer "+ this.pages);
		
		for(int i=0;i<10;i++){
			System.out.println("Printing Page :: "+ i);
		}
		
		if(this.pages<nofPages){
			System.out.println("Pages are less");
			try{
				System.out.println("Waiting for pages ....... ");
				wait();
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		System.out.println("Notification recieved inserted papers ");
		
		System.out.println("Printing Completed ");
		
	}
	
	public synchronized void insertPapers(int noOfpages){
		this.pages += noOfpages;
		System.out.println("Notification Recieved Pages inserted");
		notify();
		
	}

}