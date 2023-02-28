package p00_Common;


public class PaperContestant extends Thread {
	private int id;
	private AbstractBoard board;
	
	public PaperContestant (int id, 
			                AbstractBoard board) {
		this.id = id; this.board=board;
	}
	
	public void run () {
		while (true) {
			board.letMeAccessForPaper(id);
			board.play("PAPER["+id+"]");
			board.accessDone();
		}
	}
}

