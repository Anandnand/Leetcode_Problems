import java.util.Arrays;


//Time complexity =O(n^2)
//Arrays.sort(nums) takes O(n log n) 

public class ThreeSumClosest {
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int min = nums[0] + nums[1] + nums[2];
		for (int i = 0; i < nums.length - 2; i++) {
			int start = i + 1;
			int end = nums.length - 1;
			while (start < end) {
				int sum = nums[i] + nums[start] + nums[end];
				if (Math.abs(sum - target) < Math.abs(min - target)) {
					min = sum;
				}
				if (sum == target) {
					return sum;
				} else if (sum > target) {

					end--;
				} else {
					start++;
				}

			}
		}

		return min;
	}

	public static void main(String[] args) {
		int nums[] = { -1, 2, 1, -4 };
		int target =0;
		System.out.println(threeSumClosest(nums, target));
	}

}
