import java.util.*;

public class Race {

	private List<Contestant> contestants = new ArrayList<>();
	private List<Player> players = new ArrayList<>();
	private HashMap<Integer, Boolean> usedNumbers = new HashMap<>();

	public Race() {
	}

	public void startRace() {
		for (Contestant contestant : contestants) {
			contestant.setPlacement(randomizer(contestants.size()));
		}
		Collections.sort(contestants);
		for (Contestant contestant : contestants) {
			System.out.println(contestant.getPlacement() + " : " + contestant.getName());
		}
		raceResult();
	}


	public void raceResult() {
		for (Player player : players) {
			for (Bet bet : player.getAllBets()) {
				if (bet.getContestant().equals(contestants.get(0).getName())) {
					player.setAccount(player.getAccount());
					System.out.println(bet.getPlayer() + " has won " + bet.getAmount() * 2 + "$ with the bet: " +
							bet.getBetId());
				}
			}
		}
	}

	public void addContestants(Contestant contestant) {
		this.contestants.add(contestant);
	}

	public void addPlayers(Player player) {
		this.players.add(player);
	}

	public int randomizer(int max) {
		int number = (new Random().nextInt(max) - 1);
		boolean isUsed = usedNumbers.containsKey(number);
		if (isUsed) {
			return randomizer(max);
		} else {
			usedNumbers.put(number, true);
			return number;
		}
	}
}
