import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Time complexity=O(n^3)

public class FourthSum {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		Set<List<Integer>> s = new HashSet<>();
		List<List<Integer>> output = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int k = j + 1;
				int l = nums.length - 1;
				while (k < l) {
					long sum = nums[i];
					sum += nums[j];
					sum += nums[k];
					sum += nums[l];
					if (sum == target) {
						s.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
						k++;
						l--;
					} else if (sum < target) {
						k++;
					} else {
						l--;
					}
				}
			}
		}
		output.addAll(s);
		return output;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		List<List<Integer>> result = fourSum(nums, target);
        System.out.println(result);
	}
}
