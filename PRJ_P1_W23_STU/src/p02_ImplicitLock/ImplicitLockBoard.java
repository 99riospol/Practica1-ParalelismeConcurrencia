package p02_ImplicitLock;

import p00_Common.AbstractBoard;

public class ImplicitLockBoard extends AbstractBoard {
	
	/* Add all the boolean attributes you need */
	
	
	// use the following attributes where you deem suitable
	private volatile boolean boardBusy = false;
	private volatile int nextValidId = 0; 
	private volatile int numInstances;
	
	public ImplicitLockBoard(int numInstances) {this.numInstances = numInstances;}
	
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
