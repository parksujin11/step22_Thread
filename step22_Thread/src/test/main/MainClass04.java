package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		//{}; --> �͸��� local inner Ŭ������ �̿��ؼ� ������ �����ϱ�
		//ctrl space ������ run()
		new Thread() {
			@Override
			public void run() {
				System.out.println("���ο� ������ ���۵� ");
				//println-> ����
				//print-> ����
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				System.out.println("������� ");
				//println-> ����
				//print->���� 
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				System.out.println("�뷡���ҷ��� ");
				//println-> ����
				//print->���� 
			}
		}.start();
	}
}
