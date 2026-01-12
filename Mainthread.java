package program7;
class threadone extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Thread 1:" +i);
				System.out.println("Thread 1 will be Asleep for 2 seconds");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Thread 1 is sleeping ");
			
		}
		System.out.println("Thread is Executed");
}
	
}
	class threadtwo extends Thread{
		public void go() {
			try {
				for(int i=0;i<10;i++) {
					System.out.println("Thread 1:" +i);
					System.out.println("Thread 1 will be Asleep for 3 seconds");
					Thread.sleep(3000);
				}
			}
			catch(InterruptedException e) {
				System.out.println("Thread 1 is sleeping ");
				
			}
			System.out.println("Thread is Executed");
	}
			
		}
	
public class Mainthread {
	public static void main(String args[]) {
		threadone t1=new threadone();
		threadtwo t2=new threadtwo();
		t1.start();
		t2.start();
	}
}

