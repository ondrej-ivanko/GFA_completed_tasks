import java.util.ArrayList;

public class Sum {

	ArrayList<Integer> megaList = new ArrayList<>();

	public Sum(ArrayList<Integer> list) {
		this.megaList = list;
	}

	public int summedList(ArrayList<Integer> megaList) {
		int summed = 0;
		for (int num = 0; num < megaList.size(); num++) {
			summed += megaList.get(num);
		}
		return summed;
	}
}
