package test.main;

import test.mypac.AnotherThread;

/*
 * Thread ->작업단위가 여러개 이지만 동시에  수행하지는 않는다.
 *
 *
 * 
 *  [ Thread (작업단위) 만들기 ]
 *  
 *  (방법1)
 *  
 *  1. Thread 클래스를 상속받은 클래스를 정의한다.
 *  2. run() 메소드를 오버라이딩한다.
 *  3. 새로운 작업단위가 필요한 시점에 클래스를 이용해서 객체를 생성하고
 *     start() 라는 메소드를 호출하면 스레드가 시작된다. 
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		new AnotherThread().start();
		//작업단위 여러개 만들려면
		new AnotherThread().start();
		new AnotherThread().start();
		//여러개 작업단위를 다르게 만들려면 local inner 클래스이용해서 만들어->MainClass04 참조
		
		doSomething();
		
		System.out.println("main 메소드가 종료됩니다.");
	}
	
	public static void doSomething() {
		System.out.println("메인 스레드가 5초 일시 정지 되요~");
		
		try {
			Thread.sleep(5000);//5000->5초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("doSomething() 가 리턴 됩니다.");
	}
}
