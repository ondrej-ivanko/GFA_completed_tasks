package gardenapp;

public class Main {
	public static void main(String[] args) {
		Flower yellow = new Flower("yellow", 15);
		Flower blue = new Flower("blue", 2);

		Tree purple = new Tree("purple", 7);
		Tree orange = new Tree("orange", 25);

		Garden beautifulGarden = new Garden();

		beautifulGarden.addFlower(yellow);
		beautifulGarden.addFlower(blue);
		beautifulGarden.addTree(purple);
		beautifulGarden.addTree(orange);

		beautifulGarden.showGarden();

		beautifulGarden.waterAll(40);
		beautifulGarden.waterAll(70);


	}
}
