package p00_Common;


public class ScissorsContestant extends Thread {
	private int id;
	private AbstractBoard board;
	
	public ScissorsContestant (int id, 
			                   AbstractBoard board) 
	{
		this.id = id; this.board=board;
	}
	
	public void run () {
		while (true) {
			board.letMeAccessForScissors(id);
			board.play("SCISSORS["+id+"]");
			board.accessDone();
		}
	}
}