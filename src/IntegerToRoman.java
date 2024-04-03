
//TIME COMPLEXITY=o(1)

public class IntegerToRoman {
	public static String intToRoman(int num) {
		String roman = "";
		int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String romanletter[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				roman = roman + romanletter[i];
				num = num - values[i];
			}

		}
		return roman;
	}

	public static void main(String[] args) {
		int num = 1989;
		System.out.println(intToRoman(num));
	}
}
