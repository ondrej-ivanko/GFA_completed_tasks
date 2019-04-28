package gardenapp;

public class Flower extends Plants {

	public Flower(String type, double amount) {
		super.type = type;
		super.waterAmount = amount;
		super.waterAbsorption = 0.75;
	}

	@Override
	public void getStatus() {
		if (this.getWaterAmount() < 5) {
			System.out.println("The " + getType() + " Flower needs water.");
		} else {
			System.out.println("The " + getType() + " Flower does not need water.");
		}
	}
}
