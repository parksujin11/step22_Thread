package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * ���� ������ �޼ҵ尡 ���ϵǸ� �������. 
		 */
		String name="�豸��";
		
		new Thread() {
			@Override
			public void run() {
				System.out.println("name:"+name);
			}
		}.start();
		
		//������ �ٸ� ǥ��  
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("name:"+name);
			}
		}).start();
	}
}
