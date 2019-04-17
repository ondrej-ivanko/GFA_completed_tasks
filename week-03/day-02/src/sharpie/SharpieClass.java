package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieClass {

	List<Sharpie> initialList = initializeSharpies();


	public List<Sharpie> initializeSharpies() {
		List<Sharpie> listOfSharpies = new ArrayList<>();

		listOfSharpies.add(new Sharpie("Cyan", 0.5f));
		listOfSharpies.add(new Sharpie("Green", 0.49f));
		listOfSharpies.add(new Sharpie("Yellow", 0.3f));
		listOfSharpies.add(new Sharpie("White", 0.52f));
		listOfSharpies.add(new Sharpie("Black", 0.25f));
		return listOfSharpies;
	}
	public boolean isUsable(Sharpie sharpie) {
		if (sharpie.inkAmount > 0) {
			return true;
		}
		return false;
	}
	public void removeTrash(List<Sharpie> allmysharpies) {
		for (Sharpie sharpie : initialList) {
			if (isUsable(sharpie)) {
				allmysharpies.remove(sharpie);
			}
		}
	}
}
