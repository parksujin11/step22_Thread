package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		
		final String name="�豸��"; //�͸�Ŭ���� ���� ���������� ����� ���� �� �� �ִ�. final�� ���� 
		
		//local inner class �� �̿��ؼ� ������ ���� ��Ű��
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("�������� name:"+name);//name�� �����̷� �ٲٸ� �������� 
			}
		}).start();
		
	}

}
