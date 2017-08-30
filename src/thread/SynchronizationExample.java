
public class SynchronizationExample {

	public static void main(String[] args) {
		Display d1 = new Display();
		MyThread1 t1 = new MyThread1(d1, "dhoni");
		MyThread2 t2 = new MyThread2(d1, "shapeofyou");
		t1.start();
		t2.start();
	}
}


class Display {
	public static synchronized void  display(String name) {
		for(int i=1;i<=5;i++){
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	
	public static synchronized void play(String songName) {
		for(int i=0;i<5;i++) {
			System.out.print("playing song : ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(songName);
		}
	}
}

class MyThread1 extends Thread {
	Display display;
	String name;
	MyThread1(Display display, String name) {
		this.display = display;
		this.name = name;
	}
	public void run() {
		display.display(name);
	}
}

class MyThread2 extends Thread {
	Display display;
	String songName;
	MyThread2(Display display,String songName) {
		this.display = display;
		this.songName = songName;
	}
	public void run() {
		display.play(songName);
	}
}
