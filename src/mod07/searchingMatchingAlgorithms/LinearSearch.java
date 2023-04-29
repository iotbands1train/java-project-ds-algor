package mod07.searchingMatchingAlgorithms;

public class LinearSearch {
 
	public static void main() {
		int[] list = { 4, 5, 1, 2, 9, -3 };
		System.out.println(linearSearch(list, 2));
	}

	/** The method for finding a key in the list */
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}

}