package p03_Semaphores;

import java.util.concurrent.Semaphore;

import p00_Common.AbstractBoard;

public class SemaphoresBoard extends AbstractBoard {
	
	/* Add all the boolean attributes you need */
	
	
	private volatile int nextValidId = 0; 
	private volatile int numInstances;
	
	private Semaphore judgeCanGo;
	private Semaphore slotsAccessible;
	
	public SemaphoresBoard(int numInstances) {
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
	
	public void accessDone () {
		/* COMPLETE */
	}
}
