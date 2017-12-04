package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		
		final String name="김구라"; //익명클래스 밖의 지역변수는 상수만 참조 할 수 있다. final이 붙은 
		
		//local inner class 를 이용해서 스레드 시작 시키기
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("지역변수 name:"+name);//name을 원숭이로 바꾸면 오류생김 
			}
		}).start();
		
	}

}
