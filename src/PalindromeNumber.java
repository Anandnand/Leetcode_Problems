import java.util.Scanner;

//Time complexity: O(log n)
//Space complexity: O(1)

public class PalindromeNumber {
	public static boolean palindrome(int num) {
		if (num < 0) {
			return false;
		}
		int temp = num;
		int reversed = 0;
		
		while (num != 0) {
			reversed = (reversed * 10) + num % 10;
			num /= 10;
		}

		if (reversed == temp) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(palindrome(num));
	}

}
