package gardenapp;

public class Tree {

	String treeType;
	double waterAmount;
	double waterAbsorption = 0.4;

	public Tree(String type, int amount) {
		this.treeType = type;
		this.waterAmount = amount;
	}

	public void setWaterAmount(double waterAmount) {
		this.waterAmount += waterAmount;
	}

	public String getTreeType() {
		return treeType;
	}

	public double getWaterAbsorption() {
		return waterAbsorption;
	}

	public void getStatus() {
		if (this.waterAmount < 10) {
			System.out.println("The " + getTreeType() + " Tree needs water.");
		} else {
			System.out.println("The " + getTreeType() + " Tree does not need water.");
		}
	}
}
