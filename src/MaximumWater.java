
//TIME COMPLEXITY=O(n)

public class MaximumWater {
	public static int maxArea(int[] height) {
		int lp = 0;
		int hp = height.length - 1;
		int max = 0;

		while (lp < hp) {
			int high = Math.min(height[lp], height[hp]);
			int width = hp - lp;
			int currwater = high * width;
			max = Math.max(max, currwater);
			if (height[lp] < height[hp]) {
				lp++;
			} else {
				hp--;
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int height[] = { 2, 3, 6, 4, 7, 8, 1, 9 };
		System.out.println(maxArea(height));
	}
}
