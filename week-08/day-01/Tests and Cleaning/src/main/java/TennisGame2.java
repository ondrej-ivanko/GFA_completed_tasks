public class TennisGame2 implements TennisGame
{
	private int P1point = 0;
	private int P2point = 0;

	private String P1res = "";
	private String P2res = "";
	private String player1Name;
	private String player2Name;

	TennisGame2(String player1Name, String player2Name) {
		this.player1Name = player1Name;
		this.player2Name = player2Name;
	}

	public String getScore(){
		String score = "";
		if (P1point == P2point) {
			 if (P1point < 4) {
				switch (P1point) {
					case (0) :
						score += "Love";
						break;
					case (1) :
						score += "Fifteen";
						break;
					case (2) :
						score += "Thirty";
						break;
					case (3) :
						score += "Forty";
						break;
					default:
						score += "Deuce";
						break;
				}
			}
			 score += "-All";
		}

		if (P1point > P2point && P2point >= 3)
		{
			score = "Advantage player1";
		}

		if (P2point > P1point && P1point >= 3)
		{
			score = "Advantage player2";
		}

		if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
		{
			score = "Win for player1";
		}
		if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
		{
			score = "Win for player2";
		}
		return score;
	}

	private void SetP1Score() {
		P1point++;
	}

	private void SetP2Score() {
		P2point++;
	}

	public void wonPoint(String player) {
		if (player.equals("player1")) {
			SetP1Score();
		} else {
			SetP2Score();
		}
	}
}
