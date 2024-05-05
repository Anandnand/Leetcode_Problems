
public class CountAndSay {
	    public static  String countAndSay(int n) {
	          return util1(n);
	    }
	    public static  String util1(int n) {
	        if (n == 1) {
	            return "1";
	        }
	        String prev = util1(n - 1);
	        String ans = "";
	        int freq = 1;
	        for (int i = 0; i < prev.length(); i++) {
	            if (i == prev.length() - 1 || prev.charAt(i) != prev.charAt(i + 1)) {
	                ans += freq;
	                ans += prev.charAt(i);
	                freq = 1;
	            } else {
	                freq++;
	            }
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		int n = 4;
		System.out.println(countAndSay(n));
		
	}
}
