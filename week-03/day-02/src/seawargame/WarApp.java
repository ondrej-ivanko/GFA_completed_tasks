package seawargame;

public class WarApp {
	public static void main(String[] args) {
		Armada redArmada = new Armada();
		Armada blueArmada = new Armada();

		System.out.println(redArmada.war(blueArmada));
	}
}
