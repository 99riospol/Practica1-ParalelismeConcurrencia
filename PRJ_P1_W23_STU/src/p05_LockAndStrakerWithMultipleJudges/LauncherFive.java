package p05_LockAndStrakerWithMultipleJudges;

import p00_Common.*;

public class LauncherFive {
	public static void main (String [] args) throws InterruptedException {
		int INSTANCES = 10;
		
		AbstractBoard board = new LockBoardWithStreakerAndMultipleJudges(INSTANCES);
		PaperContestant [] papers = new PaperContestant[INSTANCES];
		RockContestant [] rocks = new RockContestant[INSTANCES];
		ScissorsContestant [] scissors = new ScissorsContestant[INSTANCES];
		Judge [] judges = new Judge[INSTANCES];
		Streaker enthusiast = new Streaker(board);
		
		for (int i=0; i<INSTANCES; i++) {
			papers[i] = new PaperContestant(i, board);
			rocks[i] = new RockContestant(i, board);
			scissors[i] = new ScissorsContestant(i, board);
			judges[i] = new Judge(i, board, true);
		}
		
		System.out.println("There we go (five)...\n");
		
		enthusiast.start();
		
		for (int i=0; i<INSTANCES; i++) {
			judges[i].start();
			papers[i].start();
			rocks[i].start();
			scissors[i].start();
		}
		
		Thread.sleep(5000);
		
		System.exit(0);
	}
}









