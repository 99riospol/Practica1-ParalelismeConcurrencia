package p00_Common;

public class Streaker extends Thread {

	private AbstractBoard board;
	
	public Streaker (AbstractBoard board) {this.board=board;}
	
	public void run () {
		while (true) {
			try {Thread.sleep(500);} catch(InterruptedException ie) {}
			board.letMeAccessForStreaker();
			System.out.println();
			System.out.print("\tWhat an Amazing Tournament ");
			for (int i=9; i>=0; i--) {
				try {Thread.sleep(40);} catch(InterruptedException ie) {}
				System.out.print(i+" ");
			}
			System.out.println("\n");
			board.accessDone();
		}
	}
}

