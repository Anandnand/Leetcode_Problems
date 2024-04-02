import java.util.Scanner;

//TIMECOMPLEXITY =O(logn)

public class ReverseInteger {
	public static int reverse(int num) {
		int reversed = 0;
		while (num != 0) {
			//STACK OVERFLOW CONDITION
			
			if(reversed>Integer.MAX_VALUE/10 || reversed<Integer.MIN_VALUE/10) {
				return 0;
			}
			reversed = (reversed * 10) + num % 10;
			num/=10;
		}
		return reversed;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
       System.out.println(reverse(num));
	}

}
