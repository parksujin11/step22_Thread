package test.mypac;
/*
 * Thread ��ӹ޾Ƽ� �ʿ��� �޼ҵ� ������ �ϱ� 
 */
public class AnotherThread extends Thread{
	//run() �޼ҵ� ������ 
	@Override
	public void run() {
		//���ο� �۾� ���� (������) �� ���۵Ǵ� run() �޼ҵ� 
		System.out.println("�� �ٸ� �����尡 ���� �Ǿ����ϴ�.");
		for(int i=0; i<10; i++) {
			try {
				
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�� �ٸ� �����尡 ���� �Ǿ����ϴ�.");
	}
}
