public class MultiThreadDemo {
	
	public static void main(String[] args){
		
		MyThread m1 = new MyThread("Thread1");
		Thread t1 = new Thread(m1);
		t1.start();
		
		MyThread m2 = new MyThread("Thread2");
		Thread t2 = new Thread(m2);
		t2.start();
		
	}
		
	
	
	
}