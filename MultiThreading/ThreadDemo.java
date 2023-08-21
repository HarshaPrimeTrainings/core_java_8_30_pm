public class ThreadDemo extends Thread{

public void run(){
	for (int i =1;i<=10;i++){
		System.out.println("Number :: "+ i);
	}
}

	public static void main(String[] args){
		
		ThreadDemo td = new ThreadDemo();
		Thread t = new Thread(td);
		t.start();
	}
	
}