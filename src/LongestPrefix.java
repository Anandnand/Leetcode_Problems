import java.util.Scanner;

public class LongestPrefix {
	public static String prefix(String str[]) {
		if(str.length==0) {
			return "";
		}
		   String prefix = str[0];
		    for (String s : str) {
		        if (s.length() < prefix.length()) {
		        	prefix = s;
		        }
		    }
		    
		for(int i=1;i<str.length;i++) {
			while(str[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0,prefix.length()-1);
				System.out.println(prefix);
			}
		}
		return prefix;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]= {"flight","flow","fligh"};
		System.out.println(prefix(str));
	}

}
