package seawargame;

import java.util.ArrayList;
import java.util.List;

public class Armada {

	List<Ship> armada = fillArmada();

	public List<Ship> fillArmada() {
		List<Ship> container = new ArrayList<>();
		for (int z = 0; z < (int)(1 + Math.random() * 10); z++) {
			container.add(new Ship ());
		}
		return container;
	}

	public boolean war(Armada opposingArmada) {
		System.out.println(this.armada.size());
		System.out.println(opposingArmada.armada.size());
		while (this.armada.isEmpty() != true && opposingArmada.armada.isEmpty() != true) {
			if (this.armada.get(0).battle(opposingArmada.armada.get(0))) {
				opposingArmada.armada.remove(0);
			} else {
				this.armada.remove(0);
			}
		} if (this.armada.isEmpty()) {
			return false;
		} else {
			opposingArmada.armada.isEmpty();
		}
		return true;
	}
}
