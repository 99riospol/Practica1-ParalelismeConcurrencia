package p05_LockAndStrakerWithMultipleJudges;



import java.util.concurrent.locks.*;

import p00_Common.AbstractBoard;

public class LockBoardWithStreakerAndMultipleJudges extends AbstractBoard {

	private Lock lock = new ReentrantLock();
	
	/* Add all the boolean attributes you need */
	

	
	private volatile int lastFirstContestantId = 0;
	private volatile int nextValidIdForSecondContestant = 0; 
	private volatile int numInstances;
	
	
	public LockBoardWithStreakerAndMultipleJudges(int numInstances) {
		this.numInstances = numInstances;
	}
	
	public void letMeAccessForPaper(int id) {
		/* COMPLETE */
	}
	
	public void letMeAccessForRock(int id) {
		/* COMPLETE */
	}
	
	public void letMeAccessForScissors(int id) {
		/* COMPLETE */
	}
	
	public void letMeAccessForJudge (int id) {
		/* COMPLETE */
	}
	
	public void letMeAccessForStreaker () {
		/* COMPLETE */
	}
	
	public void accessDone () {
		/* COMPLETE */
	}
}
