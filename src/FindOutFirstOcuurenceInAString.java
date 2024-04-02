import java.util.Scanner;

//TIME COMPLEXITY=O(n * m)   n=needle length   m=string length


public class FindOutFirstOcuurenceInAString {
	public static int firstOccurence(String str, String needle) {
		for (int i = 0; i < str.length() - needle.length() + 1; i++) {
			if (str.charAt(i) == needle.charAt(0)) {
				if (str.substring(i, needle.length() + i).equals(needle)) {
					return i;
				}
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "abcdaefgabc";
		String needle = "da";
		System.out.println(firstOccurence(str, needle));
	}

}
