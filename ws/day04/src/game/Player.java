package game;

public interface Player {
	final int MAX_POWER = 100;
	final int MIN_POWER = 0;
	
	public void hit();
	void eatPower(int p);
	void run();
	void getHit(int d);
	
}
