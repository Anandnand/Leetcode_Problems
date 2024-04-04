import java.util.HashMap;
import java.util.Map;

//time complexity=O(n)

//public class ValidAnagram {
//	    public static  boolean isAnagram(String s, String t) {
//	     if( t.length()!=s.length()){
//	          return false;
//	     }
//	        HashMap<Character,Integer> hm=new HashMap<>();
//	        for (char c : s.toCharArray()) {
//	            hm.put(c, hm.getOrDefault(c, 0) + 1);
//	        }
//	       
//
//	       HashMap<Character,Integer> hm1=new HashMap<>();
//	       for (char c : t.toCharArray()) {
//	            hm1.put(c, hm1.getOrDefault(c, 0) + 1);
//	        }
//	      for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
//	            char c = entry.getKey();
//	            int countS = entry.getValue();
//	            int countT = hm1.getOrDefault(c, 0);
//	            if (countS != countT) {
//	                return false;
//	            }
//	        }
//	       return true;
//	       
//	    
//	}
//	    public static void main(String[] args) {
//			String  s = "anagram"; 
//			String	t = "nagaram";
//			System.out.println(isAnagram(s,t));
//			
//		}
//}

//time complexity=O(n)

public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		Map<Character, Integer> count = new HashMap<>();

		// Count the frequency of characters in string s
		for (char x : s.toCharArray()) {
			count.put(x, count.getOrDefault(x, 0) + 1);
		}

		// Decrement the frequency of characters in string t
		for (char x : t.toCharArray()) {
			count.put(x, count.getOrDefault(x, 0) - 1);
		}

		// Check if any character has non-zero frequency
		for (int val : count.values()) {
			if (val != 0) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
		String s = "cap";
		String t = "act";
		System.out.println(isAnagram(s, t));

	}
}
