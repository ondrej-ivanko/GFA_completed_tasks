public class Main {
	public static void main(String[] args) {

		Player goodPlayer = new Player("Don john", 500);
		Player badPlayer = new Player("Momma Low", 350);
		Contestant contestant1 = new Contestant("Horst");
		Contestant contestant2 = new Contestant("Sonny");
		Contestant contestant3 = new Contestant("drone");
		Contestant contestant4 = new Contestant("schmuck");
		Contestant contestant5 = new Contestant("steve");
		Contestant contestant6 = new Contestant("Danny");
		goodPlayer.makeBet(contestant2, 250);
		goodPlayer.makeBet(contestant6, 250);
		goodPlayer.makeBet(contestant3, 250);
		badPlayer.makeBet(contestant4, 150);
		badPlayer.makeBet(contestant1, 150);
		badPlayer.makeBet(contestant5, 150);
		Race fineRace = new Race();
		fineRace.addContestants(contestant1);
		fineRace.addContestants(contestant2);
		fineRace.addContestants(contestant3);
		fineRace.addContestants(contestant4);
		fineRace.addContestants(contestant5);
		fineRace.addContestants(contestant6);
		fineRace.addPlayers(goodPlayer);
		fineRace.addPlayers(badPlayer);
		fineRace.startRace();
	}
}
