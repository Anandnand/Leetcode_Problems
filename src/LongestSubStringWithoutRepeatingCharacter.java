import java.util.HashSet;
import java.util.Scanner;

//Time complexity=O(n)

public class LongestSubStringWithoutRepeatingCharacter {
	public static int substring(String str) {
		int left = 0;
		int right = 0;
		int max = 0;
		HashSet<Character> hs = new HashSet<>();
		while (right < str.length()) {
			if (!hs.contains(str.charAt(right))) {
				hs.add(str.charAt(right));
				right++;
				max = Math.max(hs.size(), max);
				System.out.println(hs);
			} else {
				hs.remove(str.charAt(left));
				left++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println(substring(str));

	}

}
