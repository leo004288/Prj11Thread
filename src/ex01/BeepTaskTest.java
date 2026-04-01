package ex01;

import java.awt.Toolkit;

public class BeepTaskTest {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {			
//			try {
				System.out.println("탕");
//				throw new InterruptedException("메롱");
				Thread.sleep(500);    // 0.5
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}                            
		}

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(500);
		}
		
		
	} //

} //
