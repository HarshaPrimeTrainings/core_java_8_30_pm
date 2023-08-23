class MyThread extends Thread{
	
	public void run(){
		try{
			for(int i=1;i<=10;i++){
			System.out.println(" Number :: "+ i);
			Thread.sleep(2000);
		}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
	}
	
}

public class SleepDemo{
	
	public static void main(String[] args){
		MyThread m = new MyThread();
		Thread t = new Thread(m);
		t.start();
		
		
	}
	
}