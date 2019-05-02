public class Bet {

	int betId;
	int amount;
	String player;
	String contestant;

	public Bet(int amount, String player, String contestant) {
		this.betId = (int)(1000 + Math.random() * 10000);
		this.amount = amount;
		this.player = player;
		this.contestant = contestant;
	}

	public int getBetId() {
		return betId;
	}

	public int getAmount() {
		return amount;
	}

	public String getPlayer() {
		return player;
	}

	public String getContestant() {
		return contestant;
	}
}
