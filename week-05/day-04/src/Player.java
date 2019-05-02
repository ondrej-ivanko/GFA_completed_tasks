import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int account;
	private List<Bet> allBets = new ArrayList<>();

	public Player(String name, int account) {
		this.name = name;
		this.account = account;
	}

	public void makeBet(Contestant contestant, int amount) {
		Bet newBet = new Bet(amount, this.name, contestant.getName());
		if (this.account > amount) {
			allBets.add(newBet);
		} else {
			System.out.println("Bet not possible.");
		}
	}

	public List<Bet> getAllBets() {
		return allBets;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getAccount() {
		return account;
	}
}
