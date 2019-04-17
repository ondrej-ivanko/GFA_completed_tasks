package seawargame;

public class BattleApp {
	public static void main(String[] args) {

		Ship ghostShip = new Ship();
		Ship gythiankiShip = new Ship();

		ghostShip.pirateCrew.get(0).drinkSomeRum();
		ghostShip.pirateCrew.get(2).drinkSomeRum();
		gythiankiShip.pirateCrew.get(2).drinkSomeRum();
		ghostShip.pirateCrew.get(0).drinkSomeRum();
		ghostShip.pirateCrew.get(0).drinkSomeRum();
		ghostShip.pirateCrew.get(0).drinkSomeRum();

		ghostShip.shipState();
		gythiankiShip.shipState();

		ghostShip.battle(gythiankiShip);

		ghostShip.shipState();
		gythiankiShip.shipState();

	}
}
