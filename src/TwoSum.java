
//Time Complexity = O(n)

import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int arr[], int n, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			hm.put(arr[i], i);
		}

		for (int i = 0; i < n; i++) {
			int complement = target - arr[i];
			if (hm.containsKey(complement) && hm.get(complement) != i) {
				return new int[] { i, hm.get(complement) };
			}
		}
		return new int[0];

	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
		int n = arr.length;
		int target = 10;
		int result[] = twoSum(arr, arr.length, target);

		if (result.length == 0) {
			System.out.println("The target value is not found.");
		} else {
			for (int i : result) {
				System.out.print(i + " ");
			}

		}
	}

}
