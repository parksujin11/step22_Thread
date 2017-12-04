package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		//{}; --> 익명의 local inner 클래스를 이용해서 스레드 시작하기
		//ctrl space 누르고 run()
		new Thread() {
			@Override
			public void run() {
				System.out.println("새로운 스레드 시작됨 ");
				//println-> 엔터
				//print-> 한줄
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				System.out.println("춤을춰요 ");
				//println-> 한줄
				//print->엔터 
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				System.out.println("노래를불러요 ");
				//println-> 한줄
				//print->엔터 
			}
		}.start();
	}
}
