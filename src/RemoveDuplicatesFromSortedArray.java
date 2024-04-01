import java.util.TreeSet;

//TIME COMPLEXITY =O(n log n)

//public class RemoveDuplicatesFromSortedArray {
//	public static int removeDuplicates(int[] nums) {
//		TreeSet<Integer> hs = new TreeSet<>();
//		for (int i = 0; i < nums.length; i++) {
//			hs.add(nums[i]);
//		}
//		int index = 0;
//		for (int num : hs) {
//			nums[index++] = num;
//			System.out.print(num+" ");
//		}
//
//		return hs.size();
//	}
//
//	public static void main(String[] args) {
//		int nums[] = { 1, 2, 2, 1, 3, 5, -4, -1 };
//		System.out.println("the size of distinct elements array is");
//		removeDuplicates(nums);	
//	}
//}

//Time complexity=O(n)

class RemoveDuplicatesFromSortedArray {
	public static int removeDuplicates(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 2, 1, 3, 5, -4, -1 };
		System.out.println("the size of distinct elements array is");
		System.out.println(removeDuplicates(nums));
	}
}
