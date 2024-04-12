
//CONVERTING STRING  TO INTEGER


//TIME COMPLEXITY = O(n)

import java.util.Scanner;

public class IntegerAtoi {
	public static int atoi(String s) {
//Approach 1		
		
//		 int number = 0;
//			int sign = 1;
//
//			int i = 0;
//			while (i < s.length() && s.charAt(i) == ' ') {
//				i++;
//			}
//
//			if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
//				sign = (s.charAt(i++) == '-') ? -1 : 1;
//			}
//
//			while (i < s.length() && Character.isDigit(s.charAt(i))) {
//				int digit = s.charAt(i++) - '0';
//
//				if (number > Integer.MAX_VALUE / 10 ||(number == Integer.MAX_VALUE / 10 && digit > 7) ) {
//					return(sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
//				}
//	            
//				number = number * 10 + digit;
//			}
//			return number*sign;
		
		
//Approach 2
		
		s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int ans = 0, i = 0;
        boolean neg = s.charAt(0) == '-';
        boolean pos = s.charAt(0) == '+';

        if (neg || pos) {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return neg ? -ans : ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "   -789123";
		System.out.println(atoi(s));
	}

}
