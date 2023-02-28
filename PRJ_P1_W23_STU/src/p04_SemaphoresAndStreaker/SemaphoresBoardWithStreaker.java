package p04_SemaphoresAndStreaker;

import java.util.concurrent.Semaphore;

import p00_Common.AbstractBoard;

public class SemaphoresBoardWithStreaker extends AbstractBoard {
	
	/* Add all the boolean attributes you need */
	
	
	private volatile int nextValidId = 0; 
	private volatile int numInstances;
	
	private Semaphore judgeCanGo;
	private Semaphore streakerCanGo;
	private Semaphore slotsAccessible;
	
	public SemaphoresBoardWithStreaker(int numInstances) {
		this.numInstances = numInstances;
		
		/* Create and initialize semaphores */
		
		/* COMPLETE */
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
