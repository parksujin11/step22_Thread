package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		//������ ���� ��Ű��
		new Thread(new MyRunnable()).start();
		new Thread(new MyRunnable()).start();
		new Thread(new MyRunnable()).start();
		//�͸� Ŭ������ Ȱ���ϸ� �׶� �׋� �ٸ� �۾��� ���� �� �� �ִ�. 
		new Thread(new MyRunnable() {
			@Override
			public void run() {
				System.out.println("�����忡�� B �۾� ����");
			}
		}).start();//Runnable �͸� Ŭ���� 
		
		new Thread(new MyRunnable() {
			@Override
			public void run() {
				System.out.println("�����忡�� C �۾� ����");
			}
		}).start();
		
	}
	static class MyRunnable implements Runnable{

		@Override
		public void run() {
			System.out.println("���ο� Thread �� A �۾� ����!");	
		}
	}
}