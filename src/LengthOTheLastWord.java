import java.util.Scanner;

public class LengthOTheLastWord {
	public static int lastWordLength(String s) {
//APPROACH 1		

//		int i = s.length() - 1;
//
//		while (i >= 0 && s.charAt(i) == ' ')
//			--i;
//		final int lastIndex = i;
//		while (i >= 0 && s.charAt(i) != ' ')
//			--i;
//
//		return lastIndex - i;

//APPROACH 2		

		s = s.trim();
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(lastWordLength(s));

	}

}
