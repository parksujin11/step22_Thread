package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		//�͸��� local inner Ŭ���� 
		//Runnable type ��ü�� ���� 
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				System.out.println("�޷�~ ");
				
			}
		};
		//������ ����! 
		new Thread(r1).start();
		
		//������ �ٿ��� ǥ�� 
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("���������");
			}
		}).start();
	}
}
