package ex01;

import java.awt.Toolkit;

class ShowTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("탕");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}	
} 

public class BeepTaskThread01 {

	public static void main(String[] args) {
		
		Runnable task1 = new ShowTask();
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		Runnable task2 = new ShowTask();
		Thread thread2 = new Thread(task2);
		thread2.start();

	}

}
