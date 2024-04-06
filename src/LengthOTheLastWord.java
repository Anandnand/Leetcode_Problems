
public class LengthOTheLastWord {
	public static  int lastWordLength(String s) {
		int i = s.length() - 1;

		while (i >= 0 && s.charAt(i) == ' ')
			--i;
		final int lastIndex = i;
		while (i >= 0 && s.charAt(i) != ' ')
			--i;

		return lastIndex - i;
	}

	public static void main(String[] args) {
		String s= "   fly me   to   the sunmoon  ";
		System.out.println(lastWordLength(s) );

	}

}
