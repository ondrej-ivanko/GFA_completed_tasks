import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Homework {
	List<HashMap> treeList = fillTreeList();

	public static List<HashMap> fillTreeList() {
		List<HashMap> treesMap = new ArrayList<>();
		HashMap<String, ArrayList> oakTree = new HashMap<>();
		ArrayList<String> valuesForOak = new ArrayList<>(Arrays.asList("Oak Tree", "Yellow", "250", "male"));
		oakTree.put("Oak", valuesForOak);
		HashMap<String, ArrayList> birchTree = new HashMap<>();
		ArrayList<String> valuesForBirch = new ArrayList<>(Arrays.asList("Birch Tree", "White", "600", "female"));
		birchTree.put("Oak", valuesForBirch);
		HashMap<String, ArrayList> cedarTree = new HashMap<>();
		ArrayList<String> valuesForCedar = new ArrayList<>(Arrays.asList("Cedar Tree", "Green", "250", "male"));
		cedarTree.put("Oak", valuesForCedar);
		HashMap<String, ArrayList> redSequoyaTree = new HashMap<>();
		ArrayList<String> valuesForRedSeqoya = new ArrayList<>(Arrays.asList("Red Sequoya", "Grey", "2000", "male"));
		redSequoyaTree.put("Oak", valuesForRedSeqoya);
		HashMap<String, ArrayList> pineTree = new HashMap<>();
		ArrayList<String> valuesForPine = new ArrayList<>(Arrays.asList("Pine Tree", "Cyan", "150", "female"));
		pineTree.put("Oak", valuesForPine);
		return treesMap;
	}
}
