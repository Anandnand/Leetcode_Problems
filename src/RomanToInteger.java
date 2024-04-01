import java.util.HashMap;
import java.util.Scanner;

//Time complexity: O(n)
//Space complexity: O(1)
public class RomanToInteger {
	public static int romanToInteger(String r) {
		HashMap<Character,Integer> hm=new HashMap<>();
		hm.put('I',1);
		hm.put('V',5);
		hm.put('X',10);
		hm.put('L',50);
		hm.put('C',100);
		hm.put('D',500);
		hm.put('M',1000);
		
		int res=0;

		for(int i=0;i<r.length()-1;i++) {
			if(hm.get(r.charAt(i))<hm.get(r.charAt(i+1))) {
				res-=hm.get(r.charAt(i));
			}else {
				res+=hm.get(r.charAt(i));
			}
		}
		return res+hm.get(r.charAt(r.length()-1));


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roman value");
		String r = sc.next();
		System.out.println(romanToInteger(r));
	}
}
