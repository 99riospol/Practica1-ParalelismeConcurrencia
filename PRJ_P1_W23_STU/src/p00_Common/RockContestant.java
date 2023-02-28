package p00_Common;


public class RockContestant extends Thread {
	private int id;
	private AbstractBoard board;
	
	public RockContestant (int id, 
			               AbstractBoard board) {
		
		this.id = id; this.board=board;
	}
	
	public void run () {
		while (true) {
			board.letMeAccessForRock(id);
			board.play("ROCK["+id+"] ");
			board.accessDone();
		}
	}
}