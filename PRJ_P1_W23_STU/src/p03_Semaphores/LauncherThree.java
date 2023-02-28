package p03_Semaphores;

import p00_Common.*;

public class LauncherThree {
	public static void main (String [] args) throws InterruptedException {
		int INSTANCES = 10;
		
		AbstractBoard board = new SemaphoresBoard(INSTANCES);
		PaperContestant [] papers = new PaperContestant[INSTANCES];
		RockContestant [] rocks = new RockContestant[INSTANCES];
		ScissorsContestant [] scissors = new ScissorsContestant[INSTANCES];
		Judge judge = new Judge(0, board);
		
		for (int i=0; i<INSTANCES; i++) {
			papers[i] = new PaperContestant(i, board);
			rocks[i] = new RockContestant(i, board);
			scissors[i] = new ScissorsContestant(i, board);
		}
		
		System.out.println("There we go (three)...\n");
		
		judge.start();
		
		for (int i=0; i<INSTANCES; i++) {
			papers[i].start();
			rocks[i].start();
			scissors[i].start();
		}
		
		Thread.sleep(5000);
		
		System.exit(0);
	}
}









