package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		//익명의 local inner 클래스 
		//Runnable type 객체를 얻어내서 
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				System.out.println("달려~ ");
				
			}
		};
		//스레드 시작! 
		new Thread(r1).start();
		
		//위에거 줄여서 표현 
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("고고고고고고고씽");
			}
		}).start();
	}
}
