package p00_Common;


public class Judge extends Thread{
	private AbstractBoard board;
	private int id;
	private boolean writeId;
	
	public Judge(int id, AbstractBoard board) {
		this.board = board;
		this.id=id;
		this.writeId = false;
	}
	
	public Judge(int id, AbstractBoard board, boolean writeId) {
		this.board = board;
		this.id=id;
		this.writeId = writeId;
	}
	
	public void run () {
		while (true) {
			board.letMeAccessForJudge(id);
			judge(board.getSlots());
			board.accessDone();
		}
	}
	
	// ...
	
	private void judge(StringBuilder [] slots) {
		System.out.print(slots[0]+"\t"+slots[1]);
		System.out.print("\t\t--> ");
		switch (slots[0].substring(0,4)) {
		case "PAPE":
			if (slots[1].toString().startsWith("PAPER")) {System.err.println(" ERROR!!!"); System.exit(1);}
			else if (slots[1].toString().startsWith("ROCK")) System.out.print(" PAPER WINS, ROCK LOSES");
			else if (slots[1].toString().startsWith("SCISSORS")) System.out.print(" SCISSORS WIN, PAPER LOSES");
			break;
		case "ROCK": 
			if (slots[1].toString().startsWith("PAPER")) System.out.print(" PAPER WINS, ROCK LOSES");
			else if (slots[1].toString().startsWith("ROCK")) {System.err.println(" ERROR!!!"); System.exit(1);}
			else if (slots[1].toString().startsWith("SCISSORS")) System.out.print(" ROCK WINS, SCISSORS LOSE");
			break;
		case "SCIS": 
			if (slots[1].toString().startsWith("PAPER")) System.out.print(" SCISSORS WIN, PAPER LOSES");
			else if (slots[1].toString().startsWith("ROCK")) System.out.print(" ROCK WINS, SCISSORS LOSE");
			else if (slots[1].toString().startsWith("SCISSORS")) {System.err.println(" ERROR!!!"); System.exit(1);}
			break;
		default:
			System.err.println("Error!!!!");
			System.exit(1);
			break;
		}
		if (writeId) System.out.print("\t["+id+"]"); 
		System.out.println();
	}
}
