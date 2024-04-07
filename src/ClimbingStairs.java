import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClimbingStairs {
	public static int climbStairs(int n) {
		Map<Integer, Integer> m = new HashMap<>();
		return climbStairs(n, m);
	}

	private static  int climbStairs(int n, Map<Integer, Integer> m) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (!m.containsKey(n)) {
			m.put(n, climbStairs(n - 1, m) + climbStairs(n - 2, m));
		}
		return m.get(n);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of steps");
		int n = sc.nextInt();
		System.out.println(climbStairs(n));
		
	}
}
