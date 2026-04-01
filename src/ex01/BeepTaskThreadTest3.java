package ex01;

import java.awt.Toolkit;

public class BeepTaskThreadTest3 {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread( () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("탕");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} );
		thread1.start();
		
		Thread thread2 = new Thread( () -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} );
		thread2.start();
	
	
	
	
	
	} //

} //


