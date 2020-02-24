package game;

public class WhitePlayer implements Player {
	private String name = "White Player";
	private int power = Player.MAX_POWER;


	public void hit() {
		System.out.println(name+" is hitting");
	}

	public void eatPower(int p) {
		this.power = this.power + p;
		if(this.power > MAX_POWER) {
			this.power = MAX_POWER;
		}
		System.out.println(name+"'s power is "+power);
	}


	public void run() {
		System.out.println(name+" is running");
	}

	public void getHit(int d) {
		this.power = this.power - d;
		if(this.power < MIN_POWER) {
			this.power = MIN_POWER;
		}
		
		if(this.power == MIN_POWER) {
			System.out.println(name+" is dead");
			System.exit(0);
		} else {
			System.out.println(name+"'s power is "+power);
		}
	}
	

}
