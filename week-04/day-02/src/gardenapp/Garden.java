package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

	List<Flower> allFlowers = new ArrayList<>();
	List<Tree> allTrees = new ArrayList<>();

	public void addFlower(Flower flower) {
		allFlowers.add(flower);
	}

	public void addTree(Tree tree) {
		allTrees.add(tree);
	}

	public void showGarden() {
		for (Flower flower: allFlowers) {
			flower.getStatus();
		}
		for (Tree tree : allTrees) {
			tree.getStatus();
		}
	}

	public int flowersAndTreesCount() {
		return allTrees.size() + allFlowers.size();
	}

	public void waterAll(int waterToUse) {
		System.out.println("Watering with " + waterToUse);
		int waterPerPlant = waterToUse / flowersAndTreesCount();
		for (Flower flower: allFlowers) {
			flower.setWaterAmount(waterPerPlant * flower.waterAbsorption);
		}
		for (Tree tree : allTrees) {
			tree.setWaterAmount(waterPerPlant * tree.getWaterAbsorption());
		}
		showGarden();
	}

}
