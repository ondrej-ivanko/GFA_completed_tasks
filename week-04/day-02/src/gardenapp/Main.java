package gardenapp;

public class Main {
	public static void main(String[] args) {
		Plants yellow = new Flower("yellow", 1);
		Plants blue = new Flower("blue", 2);

		Plants purple = new Tree("purple", 7);
		Plants orange = new Tree("orange", 3);

		Garden beautifulGarden = new Garden();

		beautifulGarden.addPlant(yellow);
		beautifulGarden.addPlant(blue);
		beautifulGarden.addPlant(purple);
		beautifulGarden.addPlant(orange);

		beautifulGarden.showGarden();

		beautifulGarden.waterAll(40);
		beautifulGarden.waterAll(70);
	}
}
