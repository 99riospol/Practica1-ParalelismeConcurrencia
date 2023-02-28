package p01_CompareAndSet;

import java.util.concurrent.atomic.AtomicBoolean;

import p00_Common.AbstractBoard;

public class CompareAndSetBoard extends AbstractBoard {
	
	private AtomicBoolean boardBusy = new AtomicBoolean(false);
	
	/* Add all the boolean attributes you need 
	 * (no AtomicBoolean)
	 */
	
	
	
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
