package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

	List<Plants> allPlants = new ArrayList<>();

	public void addPlant(Plants plant) {
		allPlants.add(plant);
	}

	public void showGarden() {
		for (Plants plant : allPlants) {
			plant.getStatus();
		}
	}

	public int plantsThatNeedsWatering() {
		int needsWatering = 0;
		for (Plants plant : allPlants) {
			if (plant.needsWater()) {
				needsWatering++;
			}
		}
		return needsWatering;
	}

	public void waterAll(int waterToUse) {
		System.out.println("Watering with " + waterToUse);
		if (plantsThatNeedsWatering() > 0) {
			int waterPerPlant = waterToUse / plantsThatNeedsWatering();
			for (Plants plant: allPlants) {
				if (plant.needsWater()) {
					plant.setWaterAmount(waterPerPlant * plant.getWaterAbsorption());
				}
			}
		}
		showGarden();
	}
}
