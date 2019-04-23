package gardenapp;

public class Flower {

	String flowerType;
	double waterAmount;
	double waterAbsorption = 0.75;

	public Flower(String type, int amount) {
		this.flowerType = type;
		this.waterAmount = amount;
	}

	public void setWaterAmount(double waterAmount) {
		this.waterAmount += waterAmount;
	}

	public String getFlowerType() {
		return flowerType;
	}

	public double getWaterAbsorption() {
		return waterAbsorption;
	}

	public void getStatus() {
		if (this.waterAmount < 5) {
			System.out.println("The " + getFlowerType() + " Flower needs water.");
		} else {
			System.out.println("The " + getFlowerType() + " Flower does not need water.");
		}
	}

}
