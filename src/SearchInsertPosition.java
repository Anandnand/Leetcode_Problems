import java.util.Scanner;

//Time complexity=o(n)

public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (target > nums[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = { 1, 3, 4, 6, 7 };
		System.out.println("Enter the target to checked or to be inserted");
		int target = sc.nextInt();

		System.out.println(searchInsert(nums, target));
	}

}
