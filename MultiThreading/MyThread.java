public class MyThread implements Runnable{
	    String name;
	
		MyThread(String name){
			this.name = name;
		}
		
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(name+ " :: "+i);
		}
	}
	
	
}