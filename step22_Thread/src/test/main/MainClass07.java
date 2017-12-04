package test.main;

public class MainClass07 {
	public static void main(String[] args) {
	//1. 상속받아서
		new MyThread().start();
		
	//2. 인터페이스
		Runnable run=new MyRunnable();
		new Thread(run).start();
		
	}
	//1. 스레드 상속받아서 런 오버라이드(컨트롤 스페이스) 
	static class MyThread extends Thread{
		@Override
		public void run() {
			
		}
	}//2. 인터페이스 
	static class MyRunnable implements Runnable{
		// MyRunnable 마우스온 add~
		@Override
		public void run() {
			
		}
		
	}
}
