package p00_Common;

public abstract class AbstractBoard {
	
	private StringBuilder [] slots;
	protected volatile int nextSlot;
	
	public AbstractBoard () {
		this.slots = new StringBuilder [2];
		for (int i=0; i<slots.length; i++) slots[i]=null;
		this.nextSlot = 0;
	}
	
	public StringBuilder[] getSlots () {return this.slots;}
	
	public void play (String stuff) {
		slots[nextSlot]=new StringBuilder();
		Thread.yield();
		for (int i=0; i<stuff.length(); i++) {
			slots[nextSlot].append(stuff.charAt(i));
			Thread.yield();
		}	
		nextSlot++;
	}
	
	public abstract void letMeAccessForPaper(int id);
	public abstract void letMeAccessForRock(int id);
	public abstract void letMeAccessForScissors(int id);
	public abstract void letMeAccessForJudge(int id);
	public abstract void accessDone();
	
	public void letMeAccessForStreaker () {}
}

