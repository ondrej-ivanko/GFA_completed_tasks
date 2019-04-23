package aircraftcarrrier;

public class Main {
	public static void main(String[] args) {

		Aircraft fighter1 = new F35();
		Aircraft fighter2 = new F35();
		Aircraft fighter3 = new F35();
		Aircraft fighter4 = new F16();
		Aircraft fighter5 = new F16();

		Aircraft fighter6 = new F16();
		Aircraft fighter7 = new F16();
		Aircraft fighter8 = new F35();
		Aircraft fighter9 = new F16();
		Aircraft fighter10 = new F16();

		Carrier yamamotoBattlecruiser = new Carrier(250, 600);
		Carrier ussFranklin = new Carrier(200, 600);

		yamamotoBattlecruiser.add(fighter1);
		yamamotoBattlecruiser.add(fighter2);
		yamamotoBattlecruiser.add(fighter3);
		yamamotoBattlecruiser.add(fighter4);
		yamamotoBattlecruiser.add(fighter5);

		ussFranklin.add(fighter6);
		ussFranklin.add(fighter7);
		ussFranklin.add(fighter8);
		ussFranklin.add(fighter9);
		ussFranklin.add(fighter10);


		yamamotoBattlecruiser.fill();
		ussFranklin.fill();

		/*yamamotoBattlecruiser.getStatus();
		ussFranklin.getStatus();*/
		yamamotoBattlecruiser.fight(ussFranklin);
	}
}
