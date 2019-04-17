package seawargame;

public class BattleApp {
	public static void main(String[] args) {

		Ship ghostShip = new Ship();
		Ship gythiankiShip = new Ship();

		ghostShip.battle(gythiankiShip);

		ghostShip.shipState();
		gythiankiShip.shipState();
	}
}
