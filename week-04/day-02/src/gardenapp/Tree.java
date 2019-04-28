package gardenapp;

public class Tree extends Plants {

	public Tree(String type, double amount) {
		super.type = type;
		super.waterAmount = amount;
		super.waterAbsorption = 0.4;
	}

	@Override
	public void getStatus() {
		if (this.getWaterAmount() < 10) {
			System.out.println("The " + getType() + " Tree needs water.");
		} else {
			System.out.println("The " + getType() + " Tree does not need water.");
		}
	}
}
