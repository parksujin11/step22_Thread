package test.main;

public class MainClass07 {
	public static void main(String[] args) {
	//1. ��ӹ޾Ƽ�
		new MyThread().start();
		
	//2. �������̽�
		Runnable run=new MyRunnable();
		new Thread(run).start();
		
	}
	//1. ������ ��ӹ޾Ƽ� �� �������̵�(��Ʈ�� �����̽�) 
	static class MyThread extends Thread{
		@Override
		public void run() {
			
		}
	}//2. �������̽� 
	static class MyRunnable implements Runnable{
		// MyRunnable ���콺�� add~
		@Override
		public void run() {
			
		}
		
	}
}
